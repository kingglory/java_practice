/*
author:wensong
time:2017.12.18
function:make a expert phrase system
*/



public class ExpertPhrase{
    public static void main(String []args){
    //make three string lists
    String[] wordListOne ={"24/7","multi-Tier","30000 foot","B-To-B","win-win","smart"};
    String[] wordListTwo ={"asd","fsf","fgs","33232","fvd","fdg"};
    String[] wordListThree = {"2","42","33","0","9","1"};
    //measure out how long the string list
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;
    //general random number
    int rand1 = (int)(Math.random()*oneLength);
    int rand2 = (int)(Math.random()*twoLength);
    int rand3 = (int)(Math.random()*threeLength);
    //combine out expert phrase 
    String phrase = wordListOne[rand1]+" " +wordListTwo[rand2]+" "+wordListThree[rand3];
    //exportation
    System.out.println("What we need is a "+phrase);
    }

}
