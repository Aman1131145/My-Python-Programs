import os

oldname = "textFiles/copyThis.txt"
newname = "textFiles/khatamTataByeBye.txt"
with open(oldname) as f:
    content = f.read()

with open(newname, "w") as f:
    f.write(content)

os.remove(oldname)