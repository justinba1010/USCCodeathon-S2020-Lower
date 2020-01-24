
dim, numInstructs = map(int, input().split())
board = []
for i in range(dim):
    board.append([0] * dim)
for i in range(numInstructs):
    instruct = input().split()
    if(instruct[0] == 'h'):
        board[int(instruct[1])] = [1] * dim 
    elif(instruct[0] == 'v'):
        for j in range(dim):
            board[j][int(instruct[1])] = 1
    elif(instruct[0] == 'dr'):
        xpos = int(instruct[1])
        for j in range(int(instruct[2]), dim):
            board[j][xpos] = 1
            if(xpos + 1 >= dim):
              break
            else:
              xpos += 1
    elif(instruct[0] == 'k'):
        xpos = int(instruct[1])
        ypos = int(instruct[2])
        if(xpos - 2 >= 0):
            if(ypos - 1 >= 0):
                board[ypos - 1][xpos - 2] = 1
            if(ypos + 1 < dim):
                board[ypos + 1][xpos - 2] = 1
        if(xpos + 2 < dim):
            if(ypos - 1 >= 0):
                board[ypos - 1][xpos + 2] = 1
            if(ypos + 1 < dim):
                board[ypos + 1][xpos + 2] = 1
        if(ypos - 2 >= 0):
            if(xpos - 1 >= 0):
                board[ypos - 2][xpos - 1] = 1
            if(xpos + 1 < dim):
                board[ypos - 2][xpos + 1] = 1
        if(ypos + 2 < dim):
            if(xpos - 1 >= 0):
                board[ypos + 2][xpos - 1] = 1
            if(xpos + 1 < dim):
                board[ypos + 2][xpos + 1] = 1
    elif(instruct[0] == 'sd'):
        shift = int(instruct[1])
        for j in range(shift % dim):
            temp = board[dim - 1]
            for q in range(dim -1, 0, -1):
                board[q] = board[q - 1]
            board[0] = temp



                
    # print(instruct)
for a in range(dim):
    for b in range(dim):
        print(board[a][b], end = '')
    print()

    