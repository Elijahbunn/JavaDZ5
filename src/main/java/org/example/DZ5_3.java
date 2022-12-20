package org.example;


import java.util.*;

public class DZ5_3 {
    public static void main(String[] args) {
        String [] mas1 = new String[]{"qwe", "asd", "zxc", "poi"};
        String [] mas2 = new String[]{"asd", "ytr", "bnv", "poi", "poi"};
        Set<String> my_set = new HashSet<>();
        for (int i = 0; i < mas1.length; i++) {
            my_set.add(mas1[i]);
        }
        Map<String, Integer> my_map = new HashMap<>();
        for (int i = 0; i < mas2.length; i++) {
            if (my_set.contains(mas2[i])){
                if (my_map.containsKey(mas2[i])){
                    my_map.put(mas2[i], my_map.get(mas2[i])+1);
                }else{
                    my_map.put(mas2[i], 2);
                }
            }
        }
        int sum = 0;
        for (var entry : my_map.entrySet()) {
            System.out.println("слово - '" + entry.getKey() + "' встречается в двух списках " + entry.getValue() + " раза");
            sum += entry.getValue();
        }
        System.out.println("всего пересечений у представленных списков: " + sum);
    }
}
