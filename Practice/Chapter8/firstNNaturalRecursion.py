def sum(i):
    if i==n+1:
        return 
    else:
        return i + sum(i+1)
n = int(input("Enter the number : "))
print(sum(n))

