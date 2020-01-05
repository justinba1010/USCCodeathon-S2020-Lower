# Crazy Code Commenting

You have found a mysterious programming language in which you must find what is not commented.

## Description
While getting lost in a wikipedia article that lead to another, which lead to another... (you lost count), you came across a programming language that you had never heard of before called C#oltER-Lang (pronounced Colt-ER-Lang). This new language, C#oltER-Lang (not to be confused with C# or ER-Lang), just so happens to use many of the same symbols that are used for commenting in java, along with seemingly random uppercase letters, "#", and "/". You tried to paste an example program into your java IDE, and noticed that a large portion of the code was commented out (more easily seen now that you have syntax highlighting).


## Input
You will be given a program written in Colt-ER-Lang and must find what is not commented


## Constraints
Characters that will be in this program will only include uppercase letters from A-Z, "#", "/", and "\*" (as in you do not have to check this, this is guaranteed for you). It is also possible that some lines in the program will be blank.

## Output
Output everyhing that is NOT commented out based on java syntax highlighting. In addition, the "#" symbol should be ignored (as in do not print it). If you don't know how java commenting works, "//" means that the everything on that line after the "//" is commented out, and the "//" is also commented. The "/\*" symbol indicated the start of a block comment. This means from that point on (including itself), everything is commented out (even onto the following lines) until the symbol "\*/" (end block comment symbol) appears.

If everything on a line is commented, then a blank line should be printed.


## Sample Input 0

```
F/G#SXL/*QK
G
XYO
H#R#B
O*/MEQ/*V
```
## Sample Output 0

```
F/GSXL



MEQ
```

### Explanation 0
Here is each of the lines numbered just for this explanation
```
1) F/G#SXL/*QK
2) G
3) XYO
4) H#R#B
5) O*/MEQ/*V
```
On the first line, the # is always ignored, and the first commenting symbol is "/\*" (start of block comment) so the Q and K are ignored, but everything to the left of this "/\*" is printed (except the # because that is always ignored). This block comment is continued on the second, third, and fourth lines, so a blank line is printed for each of these because there was nothing to print. The fifth line has the "\*/" symbol, so this ends the block comment that started on line 1. Following this, MEQ is printed, but another start block comment symbol follows ("/\*"), so nothing is printed after that. 

## Sample Input 1

```
L/*Z#ZP
S#V
RM
SNK*/YOR*/F*/DC/A/FA/*I/R
QVAO#W/*S/D
DW/HF/B//QI#M/VOR*/K*/U//O/WIO/CHC#E
V//UW#K//S/*WMZ
```
## Sample Output 1

```
L


YOR*/F*/DC/A/FA

K*/U

V
```

### Explanation 1

Here is each of the lines numbered just for this explanation
```
1) L/*Z#ZP
2) S#V
3) RM
4) SNK*/YOR*/F*/DC/A/FA/*I/R
5) QVAO#W/*S/D
6) DW/HF/B//QI#M/VOR*/K*/U//O/WIO/CHC#E
7) V//UW#K//S/*WMZ
```
On the first line, the first commenting symbol is "/\*" (start of block comment) so everything after is ignored until line 4 where the end block comment symbol is (after "SNK"). After "YOR" there is an end block comment symbol, but there was no start block comment symbol to match, so "\*/" is printed. 

Everything following this until the start block comment symbol after "FA" on line 4 is printed. The matching end block comment symbol is on line 6 following "VOR". (Keep in mind that the "//" symbol on line 6 right before "QI" was ignored because it was still inside of a block comment). 

After that end block comment symbol, "K\*/U" is printed, but then the rest of the line is ignored because of the line comment symbol ("//"). Line 7 only prints "V" because immediately following is the line comment symbol.
