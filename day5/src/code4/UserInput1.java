package code4;

import java.util.Scanner;

public class UserInput1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        scanner.close();
    }
}
//In this program, we create a new Scanner object using System.in as the input source, which allows us to read input from the user. We then prompt the user to enter their name and read the input using the nextLine() method of the Scanner. Finally, we print out a greeting to the user using their input.

//Note that we close the Scanner object using the close() method to release any system resources associated with it. It's good practice to always close the Scanner object when you're done with it to avoid resource leaks.







