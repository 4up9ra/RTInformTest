package ru.bagrov;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numberArray = {1, 3, 4, 5, 1, 5, 4};
        String countString = countElements(numberArray);
        System.out.println(countString);
    }

    public static String countElements(int[] numberArray) {
        Map<Integer, Integer> countingMap = new HashMap<>();

        for (int number : numberArray) {
            if (countingMap.containsKey(number)) {
                countingMap.put(number, countingMap.get(number) + 1);
            } else {
                countingMap.put(number, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Map.Entry<Integer, Integer> entry : countingMap.entrySet()) {
            sb.append(entry.getKey()).append(" : ").append(entry.getValue()).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("}");

        return sb.toString();
    }
}