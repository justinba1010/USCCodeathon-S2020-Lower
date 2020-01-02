#!/usr/local/bin/python3
def score(n, arr):
    count = [0 for i in range(n)]
    for i in range(1, n):
        if arr[i] > arr[i-1]:
            count[i] = count[i-1] + 1
    for i in range(n-2, -1, -1):
        if arr[i] > arr[i+1] and count[i] <= count[i+1]:
            count[i] = count[i+1] + 1
    return sum(count)

n = int(input())
scores = list(map(int, input().split(" ")))

print(score(n, scores))
