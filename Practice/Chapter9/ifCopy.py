with open(input("Enter teh first file name ===> ")) as f:
    content1 = f.read()
with open(input("Enter the second file name ===> ")) as f:
    content2 = f.read()
if content1==content2:
    print("The contents inside both the fies are matching.")
else :
    print("Contents of files are not matching.")