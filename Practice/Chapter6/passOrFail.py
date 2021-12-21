t = int(input("Enter the total marks per subject : "))
a = int(input("Enter the numbers of the first subject : "))
b = int(input("Enter the numbers of the second subject : "))
c = int(input("Enter the numbers of the third subject : "))

if ((a+b+c)/(t*3))*100 >= 40:
    if (a/t)*100 >= 33 and (b/t)*100 >= 33 and (c/t)*100 >= 33:
        print("pass")
    else:
        print("fail")
else:
    print("fail")