/*
author:wensong
time:2017.12.17
function:count number of beer from 0 to 99
*/


public class BeerSong{
    public static void main(String []args){
       int beerNum = 99;
       String word = "bottles";


       while (beerNum > 0){
           
          if (beerNum==1){
           //odd number bottle
              word = "bottle";
          }
        System.out.println(beerNum + " " + word +" of beer on the wall");
        System.out.println(beerNum + " " + word +" of beer.");
        System.out.println("Take one down");
        System.out.println("Pass it around.");
        beerNum = beerNum - 1;


         if (beerNum > 0){
            System.out.println(beerNum + " "+ word +" of beer on the wall");
        }else{
          System.out.println("No more bottles of beer on the wall");
        }//else loop stop
     }//while loop stop

   }//main stop

}//class stop
           
