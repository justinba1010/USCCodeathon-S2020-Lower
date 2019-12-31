#!/usr/local/bin/python3
from math import ceil, log

def rate_adjust(rate):
    return rate + 1
n = list(map(float, input().split()))
sr = n[0]
se = n[1]
n = list(map(float, input().split()))
rr = rate_adjust(n[0])
re = rate_adjust(n[1])

n = ceil(log(se/sr)/log(rr/re))

print(n)
