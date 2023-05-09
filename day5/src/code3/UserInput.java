package code3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            System.out.println("Hello " + name + "!!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

//In this program, we create a new BufferedReader object using System.in as the input source, which allows us to read input from the user. We then prompt the user to enter their name and read the input using the readLine() method of the BufferedReader. Finally, we print out a greeting to the user using their input.

//Note that we wrap the BufferedReader in a try block and close it in a finally block to ensure that it is properly closed even if an exception is thrown.





