package code3;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); 
        //Scanner - Object 
        //Reader - created to read a number from the user's keyboard
        
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        //num - entered number is then stored in a variable
        //we calculate its remainder using % operator and check if it is divisible by 2 or not.
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
