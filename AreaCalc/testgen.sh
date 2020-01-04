# might only work on windows


#on windows, open this using run, then type Bash
# cd Documents/Eclipse/Workspace/Codeathon2020LowerSpring/src/USCCodeathon-S2020-Lower-master/AreaCalc


# SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd -P)"
# echo $SCRIPT_DIR



mkdir -p input
mkdir -p output

# cp $SCRIPT_DIR/input1.txt $SCRIPT_DIR/input/input1.txt
[[ -e ../../PerimeterSolution.java ]] && cp ../../PerimeterSolution.java ./solutions
[[ -e ../../perimGen.java ]] && cp ../../perimGen.java ./

[[ -e samples/input/ ]] && cp -r samples/input/ ./
[[ -e samples/output/ ]] && cp -r samples/output/ ./

# [[ -e f.txt ]] && cp ../../perimGen23.java ./ 
# pushd $SCRIPT_DIR

for i in {2..29}
do
  # echo "$(cd "$(dirname "$0")" && pwd -P)"
  java ./perimGen.java > input/input$i.txt
  java ./solutions/PerimeterSolution.java < input/input$i.txt > output/output$i.txt
  echo $i
done

# for i in {0..1}
# do
#   python3 ./solutions/solution.py < input/input$i.txt > output/output$i.txt
# done
# popd

rm -rf cases.zip
zip -r cases input output
