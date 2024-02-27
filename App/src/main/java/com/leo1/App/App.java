package com.leo1.App;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner myObj = new Scanner(System.in);
        String userName;
        
        //Enter username and press Enter
        System.out.println("Enter username");
        userName = myObj.nextLine();   
        System.out.println("Username is: " + userName);     
        
        }
        
    
}