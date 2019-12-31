# Budget Balance

The budgetting office at USC has begun a new plan to balance their budgets within a certain number of years. In this budget, they only have revenues, and expenses. Calculate when the university's budget will be balanced.

## Description

Given revenues, and expenses, and their rate of growth or decline, calculate the number of years until the budget is balanced, or the first year the budget is in a surplus. As in, figure out the number of years until the revenues exceed the expenses(integer).

## Input

You will be given 4 numbers, the rate of growth, and the starting values for both revenues and expenses.

```
starting_revenue starting_expense
revenue_rate expense_rate
```

## Constraints

$$ 0 < starting_revenue \leq starting_expense < 10e5 $$
$$ -1 < expense_rate \leq revenue_rate < 1 $$

## Output

The number of years until the budget is balanced.

## Sample Input 0

```
10 20
0.05 0.03
```

### Explanation

Our starting revenue is $10, and our expenses are $20. So we are running a deficit of $10. It will take us 37 years to break even. At year 36, our revenue is $57.92, and our expenses are $57.97. So at year 37, our revenue finally breaks past expenses, at year 37, we have $60.81 in revenues, and $59.70 in expenses.

## Sample Output 0

```
37
```
