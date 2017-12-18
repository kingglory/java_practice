/*
author:wensong
time :2017.12.18
function:make a class of game contain a flow(process) to guess a number
*/




public class Player{
    int number = 0;
    public void guess(){
        number = (int) (Math.random()*10);
        System.out.println("I'm guessing " + number);
    }
}
