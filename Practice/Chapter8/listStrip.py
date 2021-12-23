def remove(word):
    a = l.count(word)
    l.pop(a)
    print("List after the pop--------->",l)
    return word.strip(); 

l = []
n = int(input("Enter the number of strings that can be stored in the list : "))

for i in range (0,n):
    a = str(input("Enter the word you want to store in the list : "))

    l.append(a)

print("Here is the list ----->",l)
word = str(input("Enter the string that you want to remove from the list : "))

print("Word after being striped =>",remove(word))
