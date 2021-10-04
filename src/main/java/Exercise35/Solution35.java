/*
 *  UCF COP3330 Fall 2021 Assignment 35 Solution
 *  Copyright 2021 Garrett Adams
 */


package Exercise35;

//Imports all java util
import java.util.*;

public class Solution35 {
    public static void main(String[] args) {
        //Declares the variables that we will be using
        String Winner;
        String UsersName;
        //Uses ArrayList so we can add to it easier
        ArrayList<String> UserListOfNames = new ArrayList<String>();
        //Sets up our Scanner
        Scanner ScanWord = new Scanner(System.in);
        //Prompts the user for input
        System.out.print("Enter a name: ");
        //Scans user input to UsersName
        UsersName= ScanWord.nextLine();
        //Adds users input to the ArrayList
        UserListOfNames.add(UsersName);
        //While UsersName isnt empty
        while(!UsersName.isEmpty()){
            //Prompts user for input
            System.out.print("Enter a name: ");
            //Scans user input to UsersName
            UsersName= ScanWord.nextLine();
            //If UsersName is empty, do nothing
            if(UsersName.isEmpty()){

            }
            //If UsersName is not empty, adds the input to the array
            else{
                UserListOfNames.add(UsersName);
            }
        }


        //Sets up our Random
        Random RandomNum = new Random();
        //Stores the random into RandomArrayStorage
        int RandomArrayStorage = RandomNum.nextInt(UserListOfNames.size());
        //Sets Winner to the random element
        Winner = UserListOfNames.get(RandomArrayStorage);
        //Final output
        System.out.print("The winner is: "+ Winner + "!!!");

    }
}
