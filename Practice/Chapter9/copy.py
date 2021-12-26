with open('textFiles/this.txt') as f:
    copy = f.read()
    with open('textFiles/copyThis.txt',"w") as f:
        f.write(copy)