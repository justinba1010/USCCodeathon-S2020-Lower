import sys

# Not C friendly

matrix = []
for line in sys.stdin:
    matrix.append(list(map(lambda x: True if x == ' ' else False, line.strip('\n'))))
# seed is always 1,1
queue = [(1,1)]
visited = [list(map(lambda x: False, line)) for line in matrix]
total = 0
visited[1][1] = True
while len(queue) > 0:
    (row,col) = queue.pop()
    total += 1
    if (row - 1) >= 0 and matrix[row-1][col] and not visited[row-1][col]:
        queue.append((row-1, col))
        visited[row-1][col] = True
    if (row + 1) < len(matrix) and matrix[row+1][col] and not visited[row+1][col]:
        queue.append((row+1, col))
        visited[row+1][col] = True
    if (col - 1) >= 0 and matrix[row][col-1] and not visited[row][col-1]:
        queue.append((row, col-1))
        visited[row][col-1] = True
    if (col + 1) < len(matrix[row]) and matrix[row][col+1] and not visited[row][col+1]:
        queue.append((row, col+1))
        visited[row][col+1] = True
print(total)
