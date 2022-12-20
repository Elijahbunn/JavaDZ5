package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DZ5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово, которое хотите найти: ");
        String kotoba = scanner.nextLine().toLowerCase();
        Map<String, Integer> my_map = new HashMap<>();
        my_map.put(kotoba, 0);
        String text1 = "Мне нравится выполнять домашние задания, но Анна Семенович мне нравится больше.";
        text1 = text1.replace(".", "");
        text1 = text1.replace(",", "");
        text1 = text1.toLowerCase();
        String[] text2 = text1.split(" ");
        for (int i = 0; i < text2.length; i++) {
            if (my_map.containsKey(text2[i])) {
                my_map.put(text2[i], my_map.get(text2[i]) + 1);
            }
        }
        System.out.println(kotoba + " встречается в тексте " + my_map.get(kotoba) + " раз");
    }
}
