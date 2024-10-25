package com.griffinkingofants.hyperskill.introductiontohashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://hyperskill.org/learn/step/25745
 * <p>
 * Replacing words
 * Medium
 * 35
 * 5 days ago
 * Write a program that accepts an array of strings and a HashMap that represents a dictionary. The program must replace each element in the array with the corresponding value from the dictionary, if it exists. If an element doesn't exist in the dictionary, it must be left unchanged. The program must print out the modified array.
 * <p>
 * Sample Input 1:
 * <p>
 * 5
 * dog cat bird dog bird
 * 2
 * dog canine cat feline
 * <p>
 * Sample Output 1:
 * <p>
 * canine feline bird canine bird
 */
public class ReplacingWords {
    private static void printReplacedString(Map<String, String> map, String[] array) {
        // implement me
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                array[i] = map.get(array[i]);
            }
        }
        System.out.println(String.join(" ", array));

    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            String[] array = new String[n];
            for (int i = 0; i < n; ++i) {
                array[i] = scanner.next();
            }
            int m = scanner.nextInt();

            for (int i = 0; i < m; ++i) {
                map.put(scanner.next(), scanner.next());
            }

            printReplacedString(map, array);

        }
    }
}
