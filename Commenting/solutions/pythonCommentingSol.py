isCommented = False
while True:
    try:
        a = input()
        i = 0
        while i < len(a):
            if not(a[i] == '#'):
                if(isCommented == False):
                    if(a[i] == '/' and i + 1 < len(a) and a[i + 1] == '/'):
                        break
                    if(a[i] == '/' and i + 1 < len(a) and a[i + 1] == '*'):
                        isCommented = True
                    if(isCommented == False):
                        print(a[i], end = '')

                else:
                    if(a[i] == '*' and i + 1 < len(a) and a[i + 1] == '/'):
                        isCommented = False
                        i += 1
            i += 1
        print()
    except:
        break
