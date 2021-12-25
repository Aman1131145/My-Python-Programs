def game():
    return 44677

score = game()

with open("tables/hiscore.txt") as f:
    hiscore = f.read()


if hiscore == '':
    with open("tables/hiscore.txt", "w") as f:
        f.write(str(score))

elif hiscore<score:
    with open("tables/hiscore.txt", "w") as f:
        f.write(str(score))