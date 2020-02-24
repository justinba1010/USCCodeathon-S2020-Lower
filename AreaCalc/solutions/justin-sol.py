import sys

# Not C friendly

isFence = []
for line in sys.stdin:
    # Turn isFence into True for fence.
    isFence.append(list(map(lambda x: x == '#', line.strip('\n'))))
# seed is always 1,1
queue = [(1,1)]
visited = [list(map(lambda x: False, line)) for line in isFence]
total = 0
visited[1][1] = True
while len(queue) > 0:
    (row,col) = queue.pop()
    total += 1
    if (row - 1) >= 0 and not isFence[row-1][col] and not visited[row-1][col]:
        queue.append((row-1, col))
        visited[row-1][col] = True
    if (row + 1) < len(isFence) and not isFence[row+1][col] and not visited[row+1][col]:
        queue.append((row+1, col))
        visited[row+1][col] = True
    if (col - 1) >= 0 and not isFence[row][col-1] and not visited[row][col-1]:
        queue.append((row, col-1))
        visited[row][col-1] = True
    if (col + 1) < len(isFence[row]) and not isFence[row][col+1] and not visited[row][col+1]:
        queue.append((row, col+1))
        visited[row][col+1] = True
print(total)
