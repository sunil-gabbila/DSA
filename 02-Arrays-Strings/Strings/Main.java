import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // Read the first string from the user.
        String str1 = scanner.next();

        // Read the second string from the user.
        String str2 = scanner.next();

        // Concatenate (join) both strings into a single string.
        String res = str1 + str2;

        // Display the concatenated string with the label "Joined:".
        System.out.print("Joined: " + res);

        // Close the Scanner object.
        scanner.close();
    }
}
