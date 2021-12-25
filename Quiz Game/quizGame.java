package pappu;

import java.util.*;

public class quizGame {
    public static String playername = "";
        public static void main(String[] args) {
        mainMenu();
        
    }

    public static void mainMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\t              PROGRAM QUIZ GAME" + "\n\t    ________________________________________" + "\n\t                 WELCOME" + "\n\t                   TO" + "\n\t                THE GAME" + "\n\t    ________________________________________"+"\n\t    ________________________________________"+"\n\t        BECOME A MILLINIOAIRE!!!!!!!!!!!"+"\n\t    ________________________________________"+"\n\t    ________________________________________"+"\n\t        Press S to start the game"+"\n\t        Press V to view the highest score"+"\n\t        Press R to reset score"+"\n\t        Press H to help"+"\n\t        Press Q to quit"+"\n\t    ________________________________________\n\n");        
        String a = sc.nextLine();
        a = a.toLowerCase();
        
        if (a.contains("s")){
            System.out.println("\033[H\033[2J");
            System.out.flush();
            
            gamePlay();
        }
        else if(a.contains("h")){
            System.out.println("\033[H\033[2J");
            System.out.flush();

            help();
        }
        else if(a.contains("v")){
            System.out.println("\033[H\033[2J");
            System.out.flush();

            highestScore();
        }
        else if(a.contains("r")){
            System.out.println("\033[H\033[2J");
            System.out.flush();

            reset();
        }
        else if(a.contains("q")){
            System.out.println("\033[H\033[2J");
            System.out.flush();

            quit();
        }
        else{
            mainMenu();
        }
        sc.close();
    }

    public static void quit() {
        System.exit(1);     
    }

    public static void reset() {
		
		System.out.println("IF YOU WANT TO GO BACK TO THE MAIN MENU PRESS M\nIF YOU WANT TO RESET THE HIGH SCORE PRESS R\nPRESS ANY KEY TO QUIT THE GAME!!!!!!! ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
        a = a.toLowerCase();
		if(a.contains("m")){
			mainMenu();
		}else if(a.contains("r")){
            highestScore();
        }else{
			quit();
		}
		sc.close();
	}

    public static void highestScore() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\033[H\033[2J");
        System.out.flush();
        sc.close();
    }
    

    public static void help() { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n                              HELP"+"\n -------------------------------------------------------------------------"+"\n ......................... JAVA program Quiz Game..........."+"\n >> There are two rounds in the game, WARMUP ROUND & CHALLANGE ROUND"+"\n >> In warmup round you will be asked a total of 4 questions to test your general"+"\n    knowledge. You will be eligible to play the game if you can give atleast 3"+"\n    right answers otherwise you can't play the Game..........."+"\n >> Your game starts with the CHALLANGE ROUND. In this round you will be asked"+"\n    total 10 questions each right answer will be awarded 10,00,000."+"\n    By this way you can win upto ONE CRORE RUPEES ..............."+"\n >> You will be given 4 options and you have to press A, B ,C or D for the"+"\n    right option"+"\n >> You will be asked questions continuously if you keep giving the right answers."+"\n >> No negative marking for wrong answers"+"\n\t*********************BEST OF LUCK*********************************"+"\n\t*****JAVA PROGRAM QUIZ GAME is developed by AMAN MISHRA********\n\n");
        System.out.println("\n\nPRESS P TO PLAY THE GAME " + "\nPRESS M TO GO TO THE MAIN MENU" + "\nPRESS ANY OTHER KEY TO QUIT THE GAME\n\n");
        String a = scanner.nextLine();
        a = a.toLowerCase();
        if(a.contains("p")){
            gamePlay();
        }else if(a.contains("m")){
            mainMenu();
        }else{
            quit();
        }
        scanner.close();
    }
	
    public static void gamePlay() {
        Scanner sc = new Scanner(System.in);
		System.out.print("\n\n\n\n\n\n\n\t\t\tResister your name:");
        String name = sc.nextLine();
        playername = name.toUpperCase();
        
        System.out.print("\n ------------------  Welcome " + playername + " to Java Program Quiz Game --------------------------" + "\n\n Here are some tips you might wanna know before the game" + "\n -------------------------------------------------------------------------"+"\n >> There are 2 rounds in this Quiz Game,WARMUP ROUND & CHALLANGE ROUND"+"\n >> In warmup round you will be asked a total of 3 questions to test your"+"\n    general knowledge. You are eligible to play the game if you give atleast 2"+"\n    right answers, otherwise you can't proceed further to the Challenge Round."+"\n >> Your game starts with CHALLANGE ROUND. In this round you will be asked a"+"\n    total of 10 questions. Each right answer will be awarded $100,000!"+"\n    By this way you can win upto ONE MILLION cash prize!!!!!.........."+"\n >> You will be given 4 options and you have to press A, B ,C or D for the"+"\n    right option."+"\n >> You will be asked questions continuously, till right answers are given"+"\n >> No negative marking for wrong answers!"+"\n\n\t!!!!!!!!!!!!! ALL THE BEST !!!!!!!!!!!!!"+"\n\n\n Press Y  to start the game!\n"+"\n Press any other key to return to the main menu!\n\n");
	    String b = sc.nextLine();
        b = b.toLowerCase();        
        if (b.contains("y")){
		    warmupRound();
	    }else{
		    mainMenu();
	    }
        sc.close();
	}

	public static void warmupRound(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("WELCOME " + playername );
        int correctAnswer = 0;
        Random random = new Random();
        int arr[]={0,0,0,0,0,0,0,0,0,0};

        for(int i = 0; i < 4; i++){
            int Question = random.nextInt(11);
            if(arr[Question]==1)
            continue;
            arr[Question]=1;
            switch (Question){
                    case 0:
                    System.out.println("Which of the following is a Palindrome number?\n\nA.42042\t\tB.101010\n\nC.23232\t\tD.01234");
                    String answer = sc.nextLine();
                    answer = answer.toLowerCase();
                    
                    if (answer.contains("c")){
                        System.out.println("\n\nCorrect!!!");
                        correctAnswer = correctAnswer + 1 ;
                        if (correctAnswer >= 3) {
                            System.out.println("\n\nCONGRATULATIONS YOU CAN GO TO ROUND 2");
                            challangeRound();
                        }else if(correctAnswer >= 3){
                            System.out.println("\n\nSORRY BUT YOU ARE NOT YET ELIGIBLE TO PLAY ROUND 2");
                        }else if(correctAnswer < 3){
                            int c = 3 - correctAnswer; 
                            System.out.println("\n\nQuestions you have to answer correctly now ---> " + c);
                        }
                    }else{
                        System.out.println("\n\nWrong!!! The correct answer is C.23232");
                    }
                    break;
                
                    case 1:
                    System.out.println("The country with the highest enviromental performance index is...?\n\nA.France\t\tB.Denmark\n\nC.Swizarland\t\tD.Norway");
                    answer = sc.nextLine();
                    answer = answer.toLowerCase();
                    
                    if (answer.contains("c")){
                        System.out.println("\n\nCorrect!!!");
                        correctAnswer = correctAnswer + 1 ;
                        if (correctAnswer >= 3) {
                            System.out.println("\n\nCONGRATULATIONS YOU CAN GO TO ROUND 2");
                            challangeRound();
                        }else if(correctAnswer >= 3){
                            System.out.println("\n\nSORRY BUT YOU ARE NOT YET ELIGIBLE TO PLAY ROUND 2");
                        }else if(correctAnswer < 3){
                            int c = 3 - correctAnswer; 
                            System.out.println("\n\nQuestions you have to answer correctly now ---> " + c);
                        }
                    }else{
                        System.out.println("\n\nWrong!!! The correct answer is C.Switzerland");
                    }
                        break;
            
    
                    case 2:
                    System.out.println("\n\n\nWhich animal laughs like human being?\n\nA.Polar Bear\t\tB.Hyena\n\nC.Donkey\t\tD.Chimpanzee");
                    answer = sc.nextLine();
                    answer = answer.toLowerCase();
                    
                    if (answer.contains("b")){
                        System.out.println("\n\nCorrect!!!");
                        correctAnswer = correctAnswer + 1 ;
                        if (correctAnswer >= 3) {
                            System.out.println("\n\nCONGRATULATIONS YOU CAN GO TO ROUND 2");
                            challangeRound();
                        }else if(correctAnswer >= 3){
                            System.out.println("\n\nSORRY BUT YOU ARE NOT YET ELIGIBLE TO PLAY ROUND 2");
                        }else if(correctAnswer < 3){
                            int c = 3 - correctAnswer; 
                            System.out.println("\n\nQuestions you have to answer correctly now ---> " + c);
                        }
                    }else{
                        System.out.println("\n\nWrong!!! The correct answer is B.Hyena");
                    }
                    break;
                
                
                    case 3:
                    System.out.println("\n\n\nWho was awarded the youngest player award in Fifa World Cup 2006?\n\nA.Wayne Rooney\t\tB.Lucas Podolski\n\nC.Lionel Messi\t\tD.Christiano Ronaldo");
                    answer = sc.nextLine();
                    answer = answer.toLowerCase();
                    
                    if (answer.contains("b")){
                        System.out.println("\n\nCorrect!!!");
                        correctAnswer = correctAnswer + 1 ;
                        if (correctAnswer >= 3) {
                            System.out.println("\n\nCONGRATULATIONS YOU CAN GO TO ROUND 2");
                            challangeRound();
                        }else if(correctAnswer >= 3){
                            System.out.println("\n\nSORRY BUT YOU ARE NOT YET ELIGIBLE TO PLAY ROUND 2");
                        }else if(correctAnswer < 3){
                            int c = 3 - correctAnswer; 
                            System.out.println("\n\nQuestions you have to answer correctly now ---> " + c);
                        }
                    }else{
                        System.out.println("\n\nWrong!!! The correct answer is B.Lucas Podoski");
                    }
                        break;
                
                
                    case 4:
                    System.out.println("\n\n\nWhich is the third highest mountain in the world?\n\nA.Mt. K2\t\tB.Mt. Kanchanjungha\n\nC.Mt. Makalu\t\tD.Mt. Kilimanjaro");
                    answer = sc.nextLine();
                    answer = answer.toLowerCase();
                    
                    if (answer.contains("b")){
                        System.out.println("\n\nCorrect!!!");
                        correctAnswer = correctAnswer + 1 ;
                        if (correctAnswer >= 3) {
                            System.out.println("\n\nCONGRATULATIONS YOU CAN GO TO ROUND 2");
                            challangeRound();
                        }else if(correctAnswer >= 3){
                            System.out.println("\n\nSORRY BUT YOU ARE NOT YET ELIGIBLE TO PLAY ROUND 2");
                        }else if(correctAnswer < 3){
                            int c = 3 - correctAnswer; 
                            System.out.println("\n\nQuestions you have to answer correctly now ---> " + c);
                        }
                    }else{
                        System.out.println("\n\nWrong!!! The correct answer is B.Mt. Kanchanjungha");
                    }
                        break;
                
                
                    case 5:
                    System.out.println("\n\n\nWhat is the group of frogs known as?\n\nA.A traffic\t\tB.A toddler\n\nC.A police\t\tD.An Army");
                    answer = sc.nextLine();
                    answer = answer.toLowerCase();
                    
                    if (answer.contains("d")){
                        System.out.println("\n\nCorrect!!!");
                        correctAnswer = correctAnswer + 1 ;
                        if (correctAnswer >= 3) {
                            System.out.println("\n\nCONGRATULATIONS YOU CAN GO TO ROUND 2");
                            challangeRound();
                        }else if(correctAnswer >= 3){
                            System.out.println("\n\nSORRY BUT YOU ARE NOT YET ELIGIBLE TO PLAY ROUND 2");
                        }else if(correctAnswer < 3){
                            int c = 3 - correctAnswer; 
                            System.out.println("\n\nQuestions you have to answer correctly now ---> " + c);
                        }
                    }else{
                        System.out.println("\n\nWrong!!! The correct answer is D.An Army");
                    }
                        break;
                
                
                    case 6:
                    System.out.println("\n\n\nWhat is the name of the second person who landed on moon?\n\nA.Niel Angstrom\t\tB.Buzz Aldrin\n\nC.Yuri Gargrin\t\tD.Michael Collins");
                    answer = sc.nextLine();
                    answer = answer.toLowerCase();
                    
                    if (answer.contains("b")){
                        System.out.println("\n\nCorrect!!!");
                        correctAnswer = correctAnswer + 1 ;
                        if (correctAnswer >= 3) {
                            System.out.println("\n\nCONGRATULATIONS YOU CAN GO TO ROUND 2");
                            challangeRound();
                        }else if(correctAnswer >= 3){
                            System.out.println("\n\nSORRY BUT YOU ARE NOT YET ELIGIBLE TO PLAY ROUND 2");
                        }else if(correctAnswer < 3){
                            int c = 3 - correctAnswer; 
                            System.out.println("\n\nQuestions you have to answer correctly now ---> " + c);
                        }
                    }else{
                        System.out.println("\n\nWrong!!! The correct answer is B.Buzz Aldrin");
                    }
                        break;
                
                
                    case 7:
                    System.out.println("\n\n\nWhat is the name given to the first female Homo-sapien by scientists?\n\nA.Elizaberth\t\tB.Eve\n\nC.Lucy\t\tD.Sunny");            
                    answer = sc.nextLine();
                    answer = answer.toLowerCase();
                    
                    if (answer.contains("c")){
                        System.out.println("\n\nCorrect!!!");
                        correctAnswer = correctAnswer + 1 ;
                        if (correctAnswer >= 3) {
                            System.out.println("\n\nCONGRATULATIONS YOU CAN GO TO ROUND 2");
                            challangeRound();
                        }else if(correctAnswer >= 3){
                            System.out.println("\n\nSORRY BUT YOU ARE NOT YET ELIGIBLE TO PLAY ROUND 2");
                        }else if(correctAnswer < 3){
                            int c = 3 - correctAnswer; 
                            System.out.println("\n\nQuestions you have to answer correctly now ---> " + c);
                        }
                    }else{
                        System.out.println("\n\nWrong!!! The correct answer is C.Lucy");
                    }
                        break;
                
                
                    case 8:
                    System.out.println("\n\n\nWhat is the first programming language commercially avalaible?\n\nA.FORTRAN\t\tB.Autocode\n\nC.IPL\t\tD.LISP");
                    answer = sc.nextLine();
                    answer = answer.toLowerCase();
                    
                    if (answer.contains("a")){
                        System.out.println("\n\nCorrect!!!");
                        correctAnswer = correctAnswer + 1 ;
                        if (correctAnswer >= 3) {
                            System.out.println("\n\nCONGRATULATIONS YOU CAN GO TO ROUND 2");
                            challangeRound();
                        }else if(correctAnswer >= 3){
                            System.out.println("\n\nSORRY BUT YOU ARE NOT YET ELIGIBLE TO PLAY ROUND 2");
                        }else if(correctAnswer < 3){
                            int c = 3 - correctAnswer; 
                            System.out.println("\n\nQuestions you have to answer correctly now ---> " + c);
                        }
                    }else{
                        System.out.println("\n\nWrong!!! The correct answer is A.FORTRAN");
                    }
                        break;
                
                
                    case 9:
                    System.out.println("\n\n\nHow many time zones are there in Russia?\n\nA.9\t\tB.10\n\nC.11\t\tD.12");            
                    answer = sc.nextLine();
                    answer = answer.toLowerCase();
                    
                    if (answer.contains("c")){
                        System.out.println("\n\nCorrect!!!");
                        correctAnswer = correctAnswer + 1 ;
                        if (correctAnswer >= 3) {
                            System.out.println("\n\nCONGRATULATIONS YOU CAN GO TO ROUND 2");
                            challangeRound();
                        }else if(correctAnswer >= 3){
                            System.out.println("\n\nSORRY BUT YOU ARE NOT YET ELIGIBLE TO PLAY ROUND 2");
                        }else if(correctAnswer < 3){
                            int c = 3 - correctAnswer; 
                            System.out.println("\n\nQuestions you have to answer correctly now ---> " + c);
                        }
                    }else{
                        System.out.println("\n\nWrong!!! The correct answer is C.11");
                    }
                        break;
                
                
                    case 10:
                    System.out.println("\n\n\nBest selling book series of 21st century\n\nA.Harry Potter\t\tB.Game Of Thrones\n\nC.Twilight\t\tD.The Hunger Games");
                    answer = sc.nextLine();
                    answer = answer.toLowerCase();
                    
                    if (answer.contains("a")){
                        System.out.println("\n\nCorrect!!!");
                        correctAnswer = correctAnswer + 1 ;
                        if (correctAnswer >= 2) {
                            System.out.println("\n\nCONGRATULATIONS YOU CAN GO TO ROUND 2");
                            challangeRound();
                        }else if(correctAnswer >= 3){
                            System.out.println("\n\nSORRY BUT YOU ARE NOT YET ELIGIBLE TO PLAY ROUND 2");
                        }else if(correctAnswer < 3){
                            int c = 3 - correctAnswer; 
                            System.out.println("\n\nQuestions you have to answer correctly now ---> " + c);
                        }
                        
                    }else{
                        System.out.println("\n\nWrong!!! The correct answer is A.Harry Potter");
                    }
                        break;
    
                    default:
                        break;
            }
        }
    sc.close();
    }
          
        
    public static void challangeRound(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nWELCOME " + playername + "\n\n");
        int priceMoney = 0;
        int arr[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for(int i = 1; i <= 10; i++){
            Random random = new Random();
            int Question = random.nextInt(23);
            if(arr[Question]==1)
            continue;
            arr[Question]=1;
            switch (Question){
            case 1:
                System.out.println("What is the National Game of England?\n\nA.Football\t\tB.Basketball\n\nC.Cricket\t\tD.Baseball");
                String answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("c")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                        
                    }
                }else{
		            System.out.println("\n\nWrong!!! The correct answer is C.Cricket.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                     
                }
                    break;

            case 2:
                System.out.println("Study of Earthquake is called?\n\nA.Seismology\t\tB.Cosomology\n\nC.Orology\t\tD.Etimology");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("a")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu();
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                        
                    }
                }else{
		            System.out.println("\n\nWrong!!! The correct answer is A.Sesimology.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                     
                }
                    break;    
            case 3:
                System.out.println("Among the top 10 highest peaks in the world, how many lie in Nepal?\n\nA.6\t\tB.7\n\nC.8\t\tD.9");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("c")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                        
                    }
                }else{
		            System.out.println("\n\nWrong!!! The correct answer is C.8.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    
                     
                }
                    break;    
            case 4:
                System.out.println("The Laws of Electromagnetoc Induction were given by?\n\nA.Faraday\t\tB.Tesla\n\nC.C.Maxwell\t\tD.Couloumb");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("a")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                        
                    }
                }else{
		            System.out.println("\n\nWrong!!! The correct answer is A.Faraday.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                     
                }
                    break;    
            case 5:
                System.out.println("In what unit is electric power measured?\n\nA.Coulomb\t\tB.Watt\n\nC.Power\t\tD.Units");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("b")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                        
                    }
                }else{

		            System.out.println("\n\nWrong!!! The correct answer is B.Watt.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                     
                }
                    break;    
            case 6:
                System.out.println("Which element is found in Vitamin B12?\n\nA.Zinc\t\tB.Cobalt\n\nC.Calcium\t\tD.Iron");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("b")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                        
                    }
                }else{
		            System.out.println("\n\nWrong!!! The correct answer is b.Cobalt.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                     
                }
                    break;    
            case 7:
                System.out.println("What is the National Name of Japan?\n\nA.Poiska\t\tB.Hellas\n\nC.Drukyul\t\tD.Nippon");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                if (answer.contains("d")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                        
                    }
                }else{
		            System.out.println("\n\nWrong!!! The correct answer is D.Nippon.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                     
                }
                    break;    
            case 8:
                System.out.println("How many times can a piece of paper can be folded at the most?\n\nA.5\t\tB.6\n\nC.7\t\tD.8");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("c")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                        
                    }
                }else{
		            System.out.println("\n\nWrong!!! The correct answer is C.7.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                     
                }
                    break;    
            case 9:
                System.out.println("What is the capital of denmark?\n\nA.Copenhagen\t\tB.Helsinki\n\nC.Ajax\t\tD.Galatasaray");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("a")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                                    
                    }
                }else{
                    System.out.println("\n\nWrong!!! The correct answer is A.Copenhagen.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                }
                    break;    
            case 10:
                System.out.println("Which is the longest River in the world?\n\nA.Nile\t\tB.Koshi\n\nC.Ganga\t\tD.Amazon");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("a")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                         
                    }
                }else{
		
                    System.out.println("\n\nWrong!!! The correct answer is A.Nile.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                }
                    break;    
            case 11:
                System.out.println("What is the color of the Black Box in aeroplanes?\n\nA.White\t\tB.Black\n\nC.Orange\t\tD.Red");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("c")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                         
                    }
                }else{
		
                    System.out.println("\n\nWrong!!! The correct answer is C.Red.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                }
                    break;    
            case 12:
                System.out.println("Which city is known as 'The City Of Seven Hills'?\n\nA.Rome\t\tB.Vactican City\n\nC.Madrid\t\tD.Berlin");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("a")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                         
                    }
                }else{
		
                    System.out.println("\n\nWrong!!! The correct answer is A.Rome.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                }
                    break;    
            case 13:
                System.out.println("Name the country where there are no mosquitoes are found?\n\nA.Japan\t\tB.Italy\n\nC.Atgentina\t\tD.France");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("d")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                         
                    }
                }else{
		
                    System.out.println("\n\nWrong!!! The correct answer is D.France.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                }
                    break;    
            case 14:
                System.out.println("Who is the author of 'Pulpasa Cafe'?\n\nA.Narayan Wagle\t\tB.Lal Gopal Subedi\n\nC.B.P. Koirala\t\tD.Khagendra Sangrula");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("a")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                         
                    }
                }else{
		
                    System.out.println("\n\nWrong!!! The correct answer is A.Narayan Wagle.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                }
                    break;    
            case 15:
                System.out.println("Which Blood Group is known as the Universal Recipient?\n\nA.A\t\tB.AB\n\nC.B\t\tD.O");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("b")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                         
                    }
                }else{
		
                    System.out.println("\n\nWrong!!! The correct answer is B.AB.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                }
                    break;    
            case 16:
                System.out.println("What is the unit of measurement of distance between Stars?\n\nA.Light Year\t\tB.Couloumb\n\nC.Nautical Mile\t\tD.Kilometer");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("a")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                         
                    }
                }else{
		
                    System.out.println("\n\nWrong!!! The correct answer is A.Light Year.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                }
                    break;    
            case 17:
                System.out.println("The country famous for Samba Dance is .........\n\nA.Brazil\t\tB.Venezuela\n\nC.Nigeria\t\tD.Bolivia");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("a")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                         
                    }
                }else{
		
                    System.out.println("\n\nWrong!!! The correct answer is A.Brazil.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                }
                    break;    
            case 18:
                System.out.println("Wind speed is measured by ?\n\nA.Lysimeter\t\tB.Hydrometer\n\nC.Air Vane\t\tD.Anemometer");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("d")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                         
                    }
                }else{
		
                    System.out.println("\n\nWrong!!! The correct answer is D.Anemometer.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                }
                    break;    
            case 19:
                System.out.println("Which city is papularly known as The City of Temple?\n\nA.Delhi\t\tB.Bhagatpur\n\nC.Kathmandu\t\tD.Agra");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("c")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                         
                    }
                }else{
		
                    System.out.println("\n\nWrong!!! The correct answer is C.Kathmandu.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                }
                    break;    
            case 20:
                System.out.println("Which hardware was used in the First Generation Computer?\n\nA.Transistor\t\tB.Valves\n\nC.I.C\t\tD.S.S.I");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("b")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                         
                    }
                }else{
		
                    System.out.println("\n\nWrong!!! The correct answer is B.Valves.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                }
                    break;    
            case 21:
                System.out.println("Ozone plate is being destroyed regularly because of ?\n\nA.L.P.G\t\tB.Nitrogen\n\nC.Methane\t\tD.C.F.C");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("d")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        mainMenu(); 
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                         
                    }
                }else{
		
                    System.out.println("\n\nWrong!!! The correct answer is D.C.F.C.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                }
                    break;    
            case 22:
                System.out.println("Who won the Women's Australian Open Tennis in 2007?\n\nA.Martina Hingis\t\tB.Maria Sarapova\n\nC.Kim Clijster\t\tD.Serena Williams");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("d")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                         
                    }
                }else{
		
                    System.out.println("\n\nWrong!!! The correct answer is D.Sarena Williams.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                }
                    break;    
            case 23:
                System.out.println("Which film was awarded the Best Motion Picture at Oscar in 2010?\n\nA.The Secret In Their Eyes\t\tB.Shutter Island\n\nC.The King's Speech\t\tD.The Reader");
                answer = sc.nextLine();
                answer = answer.toLowerCase();
                
                if (answer.contains("c")){
                    System.out.println("\n\nCorrect!!!");
                    priceMoney = priceMoney + 1000000;
                    if(priceMoney >= 10000000){
                        System.out.println("Congratulations now you have 1CRORE rupees jo deta hai lele :D:D:D:D\n\n");
                        mainMenu(); 
                    }else{
                        System.out.println("YOU HAVE RUPEES " + priceMoney);
                    }
                }else{
                    System.out.println("\n\nWrong!!! The correct answer is C.The King's Speech.\n\nSORRY BUT YOU CANNOT PLAY ANYMORE \n\nBUT HEY YOU WON " + priceMoney + " RUPEES\n\nABHI KE LIYE METI TARAF SE SHUBKAMNAYE AUR BAKI PAISE JO DETA HAI USSE LENA KYPNKI MAI TO NAHI DE RHA :D:D:D");
                    mainMenu();
                }
                    break;
                    
                default:

                break;
            }
        System.out.println("yha pura ho gya");
        }
        sc.close();
        
        }

    }