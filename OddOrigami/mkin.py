#!/usr/local/bin/python3

from random import randint, random
gridDim = randint(5, 1000)
numCommands = randint(1, 100)
print(gridDim, numCommands)
for i in range(numCommands):
  decide = randint(0, 4)
  if decide == 0:
    num = randint(0, gridDim -1)
    print('h', num)
  elif decide == 1:
    num = randint(0, gridDim -1)
    print('v', num)
  elif decide == 2:
    num = randint(0, gridDim -1)
    num2 = randint(0, gridDim -1)
    print('k', num, num2)
  elif decide == 3:
    num = randint(0, gridDim -1)
    num2 = randint(0, gridDim -1)
    print('dr', num, num2)
  elif decide == 4:
    num = randint(0, gridDim* 20)
    print('sd', num)
