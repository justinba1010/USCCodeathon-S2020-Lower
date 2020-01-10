use std::io::{self, BufReader, BufWriter, Read, Write};

fn main() {
    let (stdin, stdout) = (io::stdin(), io::stdout());
    let mut bytes = BufReader::new(stdin.lock()).bytes().map(|result| result.unwrap()).peekable();
    let mut stdout_buf = BufWriter::new(stdout.lock());
    let (mut in_comment, mut in_line_comment) = (false, false);

    let is_next = |c, bytes: &mut std::iter::Peekable<_>| bytes.peek() == Some(&c);
    while let Some(b) = bytes.next() {
        if b == b'\n' {
            stdout_buf.write(&[b]).unwrap();
        }
        if in_comment {
            if b == b'*' && is_next(b'/', &mut bytes) {
                bytes.next();
                in_comment = false;
            }
        } else if in_line_comment {
            if b == b'\n' {
                in_line_comment = false;
            }
        } else if b == b'/' && is_next(b'*', &mut bytes) {
            bytes.next();
            in_comment = true;
        } else if b == b'/' && is_next(b'/', &mut bytes) {
            bytes.next();
            in_line_comment = true;
        } else if b != b'#' && b != b'\n' {
            stdout_buf.write(&[b]).unwrap();
        }
    }
}
