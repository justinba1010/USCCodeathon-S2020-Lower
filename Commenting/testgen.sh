# might only work on windows


#on windows, open this using run, then type Bash
# cd Documents/Eclipse/Workspace/Codeathon2020LowerSpring/src/USCCodeathon-S2020-Lower-master/Commenting


# SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd -P)"
# echo $SCRIPT_DIR

[[ -e input/ ]] && rm -r input/ 
[[ -e output/ ]] && rm -r output/ 
# rm -r -p output/
mkdir -p input
mkdir -p output

# cp $SCRIPT_DIR/input1.txt $SCRIPT_DIR/input/input1.txt
[[ -e ../../CommentingSolution.java ]] && cp ../../CommentingSolution.java ./solutions
[[ -e ../../CommentingGenerator.java ]] && cp ../../CommentingGenerator.java ./

[[ -e samples/input/ ]] && cp -r samples/input/ ./
[[ -e samples/output/ ]] && cp -r samples/output/ ./

# [[ -e f.txt ]] && cp ../../perimGen23.java ./ 
# pushd $SCRIPT_DIR

for i in {2..30}
do
  # echo "$(cd "$(dirname "$0")" && pwd -P)"
  java ./CommentingGenerator.java > input/input$i.txt
  java ./solutions/CommentingSolution.java < input/input$i.txt > output/output$i.txt
  echo $i
done

# for i in {0..1}
# do
#   python3 ./solutions/solution.py < input/input$i.txt > output/output$i.txt
# done
# popd

rm -rf cases.zip
zip -r cases input output
