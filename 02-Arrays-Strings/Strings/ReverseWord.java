package com.Strings;

import java.util.*;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(reverseWords(s));

        scanner.close();
    }

    public static String reverseWords(String s) {

        // Remove leading and trailing spaces
        s = s.trim();

        // Split the string into words
        String[] str = s.split("\\s+");

        StringBuffer buffer = new StringBuffer();

        // Traverse the words in reverse order
        for (int i = str.length - 1; i >= 0; i--) {

            buffer.append(str[i]);

            // Add space between words, not after the last word
            if (i != 0) {
                buffer.append(" ");
            }
        }

        return buffer.toString();
    }
}
