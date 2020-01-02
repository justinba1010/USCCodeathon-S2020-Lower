SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd -P)"

mkdir -p $SCRIPT_DIR/input
mkdir -p $SCRIPT_DIR/output

cp $SCRIPT_DIR/input1.txt $SCRIPT_DIR/input/input1.txt

pushd $SCRIPT_DIR

  for i in {15..35}
  do
    python3 ./mkin.py > input/input$i.txt;
    python3 ./solutions/solution.py < input/input$i.txt > output/output$i.txt
    echo $i
  done
  x=100
  for i in {2..14}
  do
    echo $i
    python3 ./mkin.py $x > input$i.txt
    x=$(( x*2 ))
  done
  for i in {0..14}
  do
    echo $i
    python3 ./solutions/solution.py < input/input$i.txt > output/output$i.txt
  done
popd

rm -rf cases.zip
zip -r cases input output
