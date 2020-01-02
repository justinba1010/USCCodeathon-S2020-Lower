# JJ's Greedy Extra Credit

Dr. Shepherd has decided on a new fashion of giving extra credit to 145 students.

## Description

Dr. Shepherd has decided his new extra credit will be given out according to seating arrangement and score on the extra credit assignment. He wants to give out as little extra credit as possible, with the only rule that if someone sitting to your right or your left scores higher than you, then they will receive a more extra credit than you. Find the minimum total extra credit Dr. Shepherd needs to give out. No one can get negative extra credit, and extra credit will be given out as an integer score added to your final grade. Students with the same score can have different extra credit amounts.

## Input

You will be given a single row's scores on the extra credit assignment, in the order from left to right. Find the minimum number of extra points Dr. Shepherd needs to give out. Total number of students, `n`, will be given on the first line, with the scores in seating order on the next.
```
n
score_1 score_2 ... score_n
```

## Constraints

$$ 0 \leq n \leq 1000000 $$
$$ 0 \leq score_i \leq 100 $$

## Output

Print the minimum number of extra credit Dr. Shepherd needs to hand out. 

## Sample Input 1

```
3
50 100 100
```

### Explanation

In the first example the scores were $\{50, 100, 100\}$. The optimal extra credit given out would be $\{0,1,0\}$. The reason is the middle student scored more than the first, so he has to get more, but the student to the right did not score more than the middle, so he did not fulfill scoring more than his neighbor and thus can also get the minimum as the first.
## Sample Output 1

```
1
```

## Sample Input 2

```
5
70 95 95 95 90
```

### Explanation

Much like the first example, except the optimal extra credit would be $\{0,1,0,1,0\}$.

## Sample Output 2

```
2
```
