import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read an integer from the input
        String integerStr = reader.readLine();
        int integer = Integer.parseInt(integerStr);

        // Read a string from the input
        String string = reader.readLine();

        // Check if the integer is greater than 0
        if (integer > 0) {
            // Print the string that many times
            for (int i = 0; i < integer; i++) {
                System.out.println(string);
            }
        } else {
            // Otherwise, print "Invalid input!"
            System.out.println("Invalid input!");
        }
    }
}
