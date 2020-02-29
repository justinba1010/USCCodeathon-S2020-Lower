import copy

n, c = map(int, input().split())

board = [[0] * n for _ in range(n)]

def mod(x, y):
    return x % n, y % n

for _ in range(c):
    move = input().split()
    if move[0] == 'h': # row
        y = int(move[1])
        board[y] = [1] * n
    elif move[0] == 'v': # column
        x = int(move[1])
        for i in range(n):
            board[i][x] = 1
    elif move[0] == 'dr': # diagonal, going down and to the right
        x, y = map(int, (move[1], move[2]))
        while x < n and y < n:
            board[y][x] = 1
            x += 1
            y += 1
    elif move[0] == 'k': # knight
        x, y = map(int, (move[1], move[2]))
        knight_moves = [
         (x - 2, y + 1), (x - 2, y - 1),
         (x - 1, y + 2), (x - 1, y - 2),
         (x + 1, y + 2), (x + 1, y - 2),
         (x + 2, y + 1), (x + 2, y - 1),
        ]
        for (x_i, y_i) in knight_moves:
            if x_i < 0 or x_i >= n or y_i < 0 or y_i >= n:
                continue
            board[y_i][x_i] = 1
    elif move[0] == 'sd': # wrapping shift
        a = int(move[1]) % n
        new_board = copy.deepcopy(board)
        for row in range(n):
            new_board[(row + a) % n] = board[row]
        board = new_board
    else:
        raise ValueError("what move is " + move[0] + "?")

print('\n'.join(''.join(map(str, row)) for row in board))
