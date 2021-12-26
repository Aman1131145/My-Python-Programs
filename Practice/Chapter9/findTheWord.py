with open("textFiles/poem.txt", "r") as f :
    t = f.read()

if 'Twinkle' in t:
    print('Twinkle is present in the file')
else:
    print('Twinkle is not present in the file')