# Odd Origami



## Description
After getting frustrated trying to follow an origami guide, Tommy decided to make holes in his paper instead of folds, as well as the occasional cut. 


## Input
The first line contains $n$ and $c$, where the paper is a grid of size $n$ by $n$, and the next $c$ lines will have a hole punching method that Tommy used.


The different hole punching methods are:

h y where h stands for horizontal, and y indicates the row to make hole punches on (where the top line is y = 0)

v x where v stands for vertical, and x indicates the column to make hole punches on (where the left-most line is x = 0)

k x y where k indicates knight move (like in chess) and x and y indicate the theoretical place that a knight would be. Holes are punched in all positions that a knight could move to from that x and y position

dr x y where dr stands for down and to the right, and x and y indicate the starting position to make hole punches in a diagonal downward and to the right until the edge of the paper is reached

sd a where s stands for shift-down and a is the amount to shift down. This is the only case when Tommy uses scissors and shifts each row on the paper down by $a$. The row at the bottom is moved to the top

## Constraints

## Output
Print what the paper looks like after all of the hole punching methods have been done. The paper starts as all 0's, and any time a hole punch is made on a cell, it changes to a 1. If a cell is already a 1 and is it hole punched again, it does not change.



## Sample Input 0

```
8 4
k 1 3
h 6
h 7
sd 1
```
## Sample Output 0

```
11111111
00000000
10100000
00010000
00000000
00010000
10100000
11111111
```

### Explanation 0
```
The board is 8 by 8, and has 4 instructions
The first instruction is to show knight moves starting from the position x = 1 and y = 3. In this case only 6 out of the maximum of 8 are able to be made as the 2 that would be on the left are cut off as shown here (2 added only for this explanation to show where the knight would be placed):
00000000
10100000
00010000
02000000
00010000
10100000
00000000
00000000

Next a horizontal line of hole punches are made on row 6 
00000000
10100000
00010000
00000000
00010000
10100000
11111111
00000000

Next a horizontal line of hole punches are made on row 7
00000000
10100000
00010000
00000000
00010000
10100000
11111111
11111111

Lastly, all rows are then shifted down by 1, with the bottom row moving to the top
11111111
00000000
10100000
00010000
00000000
00010000
10100000
11111111
```

## Sample Input 1

```
10 5
dr 7 1
dr 0 6
v 0
sd 2
h 5
```
## Sample Output 1

```
1010000000
1001000000
1000000000
1000000100
1000000010
1111111111
1000000000
1000000000
1000000000
1100000000
```

### Explanation 1

```
The board is 10 by 10, with 5 instructions
The first is holes down and to the right from x = 7, y = 1
0000000000
0000000100
0000000010
0000000001
0000000000
0000000000
0000000000
0000000000
0000000000
0000000000

Next is holes down and to the right from x = 0, y = 6
0000000000
0000000100
0000000010
0000000001
0000000000
0000000000
1000000000
0100000000
0010000000
0001000000

Next is a vertical line of holes in column 0
1000000000
1000000100
1000000010
1000000001
1000000000
1000000000
1000000000
1100000000
1010000000
1001000000

Next everything is shifted downward by 2
1010000000
1001000000
1000000000
1000000100
1000000010
1000000001
1000000000
1000000000
1000000000
1100000000

Lastly a horizontal line of holes is made at y = 5
1010000000
1001000000
1000000000
1000000100
1000000010
1111111111
1000000000
1000000000
1000000000
1100000000
```
