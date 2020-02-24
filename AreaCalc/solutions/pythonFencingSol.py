board = []
lineCounter = 0
yDim = int(input())
xDim = int(input())
curLine = input()
try:
    while curLine != '':
        # print(curLine)
        board.append(curLine)
        # for i in range(len(curLine)):
        #     # print(i)
        #     board[lineCounter].append(curLine[i:i+1])
        curLine = input()
        lineCounter += 1
except:
    pass

markedBoard = []
for i in range(len(board)):
    a = []
    for j in range(len(board[i])):
        if(board[i][j] == ' '):
            a.append(0)
        else:
            a.append(2)
    markedBoard.append(a)
# print(board)
# print(markedBoard)

markedBoard[1][1] = 1

for z in range(60):
    for i in range(1, len(markedBoard) - 1):
        for j in range(1, len(markedBoard[i]) - 1):
            # print(markedBoard[i][j], markedBoard[i + 1][j])
            # print(markedBoard[i + 1][j])
            if(markedBoard[i][j] == 1):
                if(markedBoard[i][j + 1] == 0):
                    markedBoard[i][j + 1] = 1
                if(markedBoard[i][j - 1] == 0):
                    markedBoard[i][j - 1] = 1
                if(markedBoard[i + 1][j] == 0):
                    markedBoard[i + 1][j] = 1
                    # print("worked")
                if(markedBoard[i - 1][j] == 0):
                    markedBoard[i - 1][j] = 1
            # print('after', markedBoard[i][j], markedBoard[i + 1][j])
# print(markedBoard)
total = 0
for i in range(len(markedBoard)):
    total += (markedBoard[i].count(1))

print(total)