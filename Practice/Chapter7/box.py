n = int(input("Enter Number of n: ")) 
for i in range(0, n):
    for j in range(0, n):
        if(i == 0 or i == n - 1 or j == 0 or j == n - 1):
            print('O', end = '  ')
        else:
            print(' ', end = '  ')
    print()