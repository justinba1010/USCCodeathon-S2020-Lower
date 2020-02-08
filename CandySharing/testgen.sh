# might only work on windows

#on windows, open this using run, then type Bash
# cd Documents/Eclipse/Workspace/Codeathon2020LowerSpring/src/USCCodeathon-S2020-Lower-master/OddOrigami

#leave out the file extension (assumes java)
SOLUTION_NAME="CandySharing"

[[ -e input/ ]] && rm -r input/ 
[[ -e output/ ]] && rm -r output/ 
# rm -r -p output/
mkdir -p input
mkdir -p output

# cp $SCRIPT_DIR/input1.txt $SCRIPT_DIR/input/input1.txt
[[ -e ../../$SOLUTION_NAME.java ]] && cp ../../$SOLUTION_NAME.java ./solutions
# [[ -e ../../CommentingGenerator.java ]] && cp ../../CommentingGenerator.java ./

for i in {0..2}
do
  java ./solutions/$SOLUTION_NAME.java < samples/input/input$i.txt > samples/output/output$i.txt
done

[[ -e samples/input/ ]] && cp -r samples/input/ ./
[[ -e samples/output/ ]] && cp -r samples/output/ ./

for i in {3..30}
do
  # echo "$(cd "$(dirname "$0")" && pwd -P)"
  python3 ./mkin.py > input/input$i.txt
  java ./solutions/$SOLUTION_NAME.java < input/input$i.txt > output/output$i.txt
  echo $i
done

rm -rf cases.zip
zip -r cases input output