def greatest():
    if a > b:
        if a > c:
            if a > d:
                print(a)
            elif d > a:
                print(d)
        elif c > a:
            if c > d:
                print(c)
            elif d > c:
                print(d)
    elif b > a:
        if b > c:
            if c > d:
                print(c)
            elif d > c:
                print(d)
        elif c > b:
            if c > d:
                print(c)
            elif d > c:
                print(d)

a = int(input("Enter the first number : "))
b = int(input("Enter the second number : "))
c = int(input("Enter the third number : "))
d = int(input("Enter the fourth number : "))

greatest();