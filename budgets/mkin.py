#!/usr/local/bin/python3

from random import randint, random

se = randint(1, 10**5)
sr = randint(1, se-5)

rr = random()*2-1
re = random()*(rr+1)-1

print("{} {}".format(sr, se))
print("{} {}".format(rr, re))
