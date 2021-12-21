d = {}

n = int(input("Enter the number of friends : "))

for i in range (0,n):
    d.update({input("Enter the name of the friend : ") : input("Enter the language")})

print(d)