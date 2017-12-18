/*
author:wensong
time :2017.12.18
function:make a class of game contain a flow(process) to guess a number
*/





public class GuessGame{
    //make three player instance
    Player p1;
    Player p2;
    Player p3;
 
    public void startGame(){
       //make three player projects
       p1 = new Player();
       p2 = new Player();
       p3 = new Player();
       //state three variables to store the result making sure that if someone guessed the  
       //right number as the random number that the program gives out .
       int guessp1 = 0;
       int guessp2 = 0;
       int guessp3 = 0;
       //state three variables to store the number guessed.
       boolean p1isRight = false;
       boolean p2isRight = false;
       boolean p3isRight = false;
       //general the random number 
       int targetNumber = (int) (Math.random()*10);
       System.out.println("I'am thinking of a number between 0 and 9...");
       
       while(true){
       System.out.println("Number to guess is "+ targetNumber);
     
       //call the method guess()

       p1.guess();
       p2.guess();
       p3.guess();

       //take out the number that each player guess,then give them one by one
       guessp1 = p1.number;
       System.out.println("Player one guess" + guessp1);
       
       guessp2 = p2.number;
       System.out.println("Player two guess" + guessp2);
      
       guessp3 = p3.number;
       System.out.println("Player three guess" + guessp3);

       if (guessp1 == targetNumber){
          p1isRight = true;
        }
       if(guessp2 == targetNumber){
          p2isRight = true;
        }
       if(guessp3 == targetNumber){
          p3isRight = true;
        }

       if (p1isRight || p2isRight || p3isRight){
          System.out.println("we have a winner!");
          System.out.println("player one got it right?" + p1isRight);
          System.out.println("player two got it right?" + p2isRight);
          System.out.println("player three got it right?" + p3isRight);
          System.out.println("Game is over.");
          break;//game stop
       }else{
          //no one guessed the right number,restart the game
         System.out.println("Players will have to try again.");
         }//if...else...    stop
       }//while loop stop
    }//method stop
}//class stop




