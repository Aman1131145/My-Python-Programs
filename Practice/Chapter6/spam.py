spam = {"make a bit of money", "buy now", "subscribe this", "click this"}
message = input("input the message : ")

if message in spam :
    print("IT IS A SPAM MESSAGE")
else:
    print("IT IS NOT SPAM")