package com.griffinkingofants.hyperskill.introductiontohashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://hyperskill.org/learn/step/25737
 * Write a program to accept an integer n and to input n key and value pairs. Print the value of maximum key.
 * <p>
 * Sample Input 1:
 * <p>
 * 2
 * 0 2
 * 5 4
 * <p>
 * Sample Output 1:
 * <p>
 * 4
 */
public class MaximumFinding {
    private static int maxKey(Map<Integer, Integer> map) {
        Optional<Integer> found = map.keySet().stream().max(Integer::compare);
        if (found.isPresent()) {
            return found.get();
        }
        throw new IllegalArgumentException("bad data");
    }

    private static void printMaxKey(Map<Integer, Integer> map) {
        System.out.println(map.get(maxKey(map)));
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; ++i) {
                map.put(scanner.nextInt(), scanner.nextInt());
            }
            printMaxKey(map);

        }
    }

    private HashMap<Integer, Integer> myHashMap() {
        return (HashMap<Integer, Integer>) Stream.of(new Integer[][]{
                {0, 2},
                {5, 4},
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
    }
}
