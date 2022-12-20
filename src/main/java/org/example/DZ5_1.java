package org.example;

import java.util.HashMap;
import java.util.Map;

public class DZ5_1 {
    public static void main(String[] args) {
        String text1 = "Я люблю Java, но Java не любит меня. Меня это печалит.";
        text1 = text1.replace(".", "");
        text1 = text1.replace(",", "");
        text1 = text1.toLowerCase();
        String [] text2 = text1.split(" ");
        Map<String, Integer> map1 =  new HashMap<>();
        for (int i = 0; i < text2.length; i++) {
            if (map1.containsKey(text2[i])) {
             map1.put(text2[i], map1.get(text2[i]) + 1);
             } else {
             map1.put(text2[i], 1);
             }
        }
        for (var entry : map1.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("слово - '" + entry.getKey() + "' встречается " + entry.getValue() + " раз");
            }else{
                System.out.println("слово - '" + entry.getKey() + "' встречается " + entry.getValue() + " раза");
            }
        }
    }
}