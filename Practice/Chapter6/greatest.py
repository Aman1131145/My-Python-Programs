a = input()
b = input()
c = input()
d = input()

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
     