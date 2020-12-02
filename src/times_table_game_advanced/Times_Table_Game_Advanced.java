//TIMES TABLE GAME:

//1. Asks whether the user wnats to learn or whether the user wants to play 
//2. IF LEARN:
//   -Asks the user what times table 1-10
//   -Prints the times table
//2. IF PLAY:
//   -Ask the user what time table they want 1-10
//   -Test them on random times table questions 
//   -Calculate the players score 


//++Adding methods to the code to make it look smoother
//++Printing out the score of the user at the end of the game if they choose test 

package times_table_game_advanced;

import java.util.Scanner; 
import java.util.Random; 


public class Times_Table_Game_Advanced {
    

    //Method that holds the formalities of the game:
    public static void formalities(){
        //Formalities: 
        System.out.println("Welcome to the Times Table Game"); 
        System.out.println("");
        System.out.println("You can either learn a times table or you can test yourself"); 
        System.out.println("Input either, 1 or 2 for which ever you want below:");
    }
    
    
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        
        //Setting varibales early:
      
        formalities(); 
        
        
        System.out.println(" 1: Learn times tables \n 2: Test my times tables");
        int gameType = input.nextInt(); 
        
        
        
        //Using a case and a switch to run the game: 
        switch(gameType){
            //For learning the times tables: 
            case(1): 
                case1(); 
                break; 
                
                
                
            //For when they want to test the times tables:     
            case(2):
                case2();       
        }
 
   
    }
    
    
    
    //Method that will run the code that allows user to learn times tables:
    public static void case1(){
        Scanner input = new Scanner(System.in); 
        boolean learn = true; 
        
        System.out.println("");
                System.out.println(""); 
                System.out.println("Here you will learn a times table!"); 
                System.out.println("");
                
                //Starting to learn the times table: 
                while(learn == true){
                    System.out.println("Choose a times table between 1 and 10"); 
                    int timesTable = input.nextInt(); 
                    System.out.println("You have choosen to learn the " + timesTable + " Times Table"); 
                    System.out.println("");
                    for(int i = 1; i < 11; i++){
                        System.out.println(i + " x " + timesTable + " = " + timesTable * i);
                        }
                    if(timesTable > 10 || timesTable < 1){
                        System.out.println("ONLY NUMBERS BETWEEN 1 AND 10 PLEASE");
                        learn = true; 
                    }
                    System.out.println("");
                    System.out.println("Would you like to stop? Yes or No?");
                    String done = input.next();
                    if(done.equalsIgnoreCase("Yes")){
                        System.out.println("Thanks for playing");
                        learn = false; 
                    } 
                    else{
                        learn = true; 
                    }
                    
                  
                }
                 
        
    }
    
    
    
    //Method that has code that allows user to test themsleves on their times tables:
    public static void case2(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random(); 
        int playerScore = 0; 
        boolean test = true; 
        
        
        System.out.println("");
                System.out.println(""); 
                System.out.println("You have chosen to test yourself");
                System.out.println("");
                
                //Starting to test the player:
                while(test == true){
                    System.out.println("What times table do you want to be tested on?"); 
                    int testTimesTable = input.nextInt();
                    System.out.println("You have chosen to test on the " + testTimesTable + " Times Tables");
                    if(testTimesTable > 10 || testTimesTable > 1){
                        System.out.println("ONLY NUMBERS BETWEEN 1 AND 10 PLEASE"); 
                        test = false; 
                    }
                    
                    //Setting varibales for random number: 
                    int max = 10;
                    int min = 1; 
                    int randomNumber = rand.nextInt((max - min)+1) + min; 
                    
                    System.out.println("What is the answer to:");
                    System.out.println(randomNumber + " x " + testTimesTable);
                    int userAnswer = input.nextInt(); 
                    int answer = randomNumber * testTimesTable; 
                    if(userAnswer == answer){
                        System.out.println("Well done"); 
                        playerScore = playerScore + 1;
                        System.out.println("Your score is ... " + playerScore); 
                        
                    }
                    else{
                        System.out.println("That was wrong");
                        System.out.println("The corret answer would be... " + answer); 
                    }
                    
                    System.out.println("Would you like to stop? Yes or No"); 
                    String finish = input.next(); 
                    if(finish.equalsIgnoreCase("Yes")){
                        System.out.println("Thanks for playing");
                        System.out.println("Your final score was... " + playerScore); 
                        test = false; 
                    }
                    else{
                        test = true; 
                    }
                    
                    
                }
                
        }
        
    }
    
    
    
    
    

