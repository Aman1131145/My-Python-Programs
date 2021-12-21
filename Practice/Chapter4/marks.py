marks = []

n = int(input("Input the no. of students:"))

for i in range (0,n):
    a = int(input())
    
    marks.append(a)

marks.sort()

print(marks)