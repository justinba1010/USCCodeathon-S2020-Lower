"""
starting_revenue starting_expense
revenue_rate expense_rate
"""
inc, out = map(float, input().split())
inc_increase, out_increase = map(lambda f: float(f) + 1, input().split())

years = 0
while inc <= out:
    inc *= inc_increase
    out *= out_increase
    years += 1
    
print(years)