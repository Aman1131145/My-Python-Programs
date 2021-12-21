n = int(input("Enter the number : "))

a = 0
for i in range(2,n-1):
    a = n%i
    if a == 0 :
        print("It is not prime number")
        break
    else :
        print("It is a prime number")
        break


    