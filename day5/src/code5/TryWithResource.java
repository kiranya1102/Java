package code5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        String filePath = "example.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//In this program, we open a file using a BufferedReader wrapped in a try statement with parentheses that declare the BufferedReader as a resource. This way, the BufferedReader is automatically closed when the try block exits, even if an exception is thrown.

//We then read the file line by line using the readLine() method of the BufferedReader, printing each line to the console. If an IOException is thrown, we catch it and print its stack trace.

//Note that the BufferedReader is declared inside the parentheses of the try statement and doesn't need to be closed manually using a finally block. This is because the try-with-resources statement automatically takes care of closing the resource for us.






