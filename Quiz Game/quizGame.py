
# playername = str(input("Enter the name of the player ==>"))
# playername.upper()

# def mainMenu():
#     print("\tWelcome ", playername)
#     print("\n\t              PROGRAM QUIZ GAME" + "\n\t    ________________________________________" + "\n\t                 WELCOME" + "\n\t                   TO" + "\n\t                THE GAME" + "\n\t    ________________________________________"+"\n\t    ________________________________________"+"\n\t        BECOME A MILLINIOAIRE!!!!!!!!!!!"+"\n\t    ________________________________________"+"\n\t    ________________________________________"+"\n\t        Press S to start the game"+"\n\t        Press V to view the highest score"+"\n\t        Press R to reset score"+"\n\t        Press H to help"+"\n\t        Press Q to quit"+"\n\t    ________________________________________\n\n",end="\r")

#     choice = str(input("Enter your choice ===> "))
#     choice.lower()

#     if 's' in choice:
#         gamePlay()
#     elif 'h' in choice:
#         help()
#     elif 'v' in choice:
#         highestScore()
#     elif 'r' in choice:
#         reset()
#     elif 'q' in choice:
#         quit()
#     else:
#         mainMenu()

# def quit():
#     print("See you again :)  :)")

# def highscoreReset():
#     with open("highsore.txt","w") as f :
#         f.write("0")

# def reset():
#     print("IF YOU WANT TO GO BACK TO THE MAIN MENU PRESS M\nIF YOU WANT TO RESET THE HIGH SCORE PRESS R\nPRESS ANY KEY TO QUIT THE GAME!!!!!!! ")

#     resetChoice = str(input("Enter the choice ==> "))
#     resetChoice.lower()

#     if 'm' in resetChoice:
#         mainMenu()
#     elif 'r' in resetChoice:
#         highscoreReset()
#     else:
#         quit()

# def highestScore():
#     with open("highscore.txt","r") as f:
#         print(f.read())

# def gamePlay():
#     print("\n ------------------  Welcome " + playername + " to Java Program Quiz Game --------------------------" + "\n\n Here are some tips you might wanna know before the game" + "\n -------------------------------------------------------------------------"+"\n >> There are 2 rounds in this Quiz Game,WARMUP ROUND & CHALLANGE ROUND"+"\n >> In warmup round you will be asked a total of 3 questions to test your"+"\n    general knowledge. You are eligible to play the game if you give atleast 2"+"\n    right answers, otherwise you can't proceed further to the Challenge Round."+"\n >> Your game starts with CHALLANGE ROUND. In this round you will be asked a"+"\n    total of 10 questions. Each right answer will be awarded $100,000!"+"\n    By this way you can win upto ONE MILLION cash prize!!!!!.........."+"\n >> You will be given 4 options and you have to press A, B ,C or D for the"+"\n    right option."+"\n >> You will be asked questions continuously, till right answers are given"+"\n >> No negative marking for wrong answers!"+"\n\n\t!!!!!!!!!!!!! ALL THE BEST !!!!!!!!!!!!!"+"\n\n\n Press Y  to start the game!\n"+"\n Press any other key to return to the main menu!\n\n")
#     gamePlayChoice = str(input("Enter your choice ==> "))

#     if 'y' in gamePlayChoice:
#         warmupRound()
#     else:
#         mainMenu()
# def warmupRound():
#     print("WELCOME", playername)
    
question = int(input("Enter the no of question : "))

for i in range (0,question):
    with open("WarmupQuestion.txt","a") as f:
        f.write(str(input("Enter the question number"+i)))