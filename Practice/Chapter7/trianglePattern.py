n = int(input("Enter the number for the pattern : "))

for i in range (1,n+1):
    for j in range (1,n-i+1):
        print(" ", end = "")
    for j in range (0, i + (i-1)):
        print("*", end = "")
    print()