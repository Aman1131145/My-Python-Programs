words = ["donkey","hell","fucking"]

with open("textFiles/sample.txt") as f:
    content = f.read()

for word in words:
    content = content.replace(word,"####")
    with open("textFiles/sample.txt","w") as f:
        f.write(content)