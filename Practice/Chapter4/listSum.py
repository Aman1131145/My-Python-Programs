list = []

n = int(input("Enter the no of items you want in the list: "))

for i in range (0,n):
    a = int(input("Enter the element of the list: "))

    list.append(a)

Sum = sum(list)
print(Sum)