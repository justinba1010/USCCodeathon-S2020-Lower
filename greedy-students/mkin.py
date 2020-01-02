#!/usr/local/bin/python3

from random import randint
import sys

n = randint(10, 1000000) if len(sys.argv) < 2 else int(sys.argv[1])
l = [randint(0,100) for _ in range(n)]
print(n)
print(" ".join(list(map(str, l))))
