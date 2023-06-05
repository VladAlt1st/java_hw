package org.StringGenericHW2023_06_01.StringTasks;

import java.util.*;

// TODO: Напишите программу, которая принимает на вход строку и выводит
//  все возможные комбинации символов этой строки в порядке возрастания их длины.
public class Task_4 {
    public static void main(String[] args) {
        String s = "ABCD";

        findPossibleCombinations(s);
    }

    private static void findPossibleCombinations(String s) {
        if (s == null || s.length() == 0) return;
        Set<String> set = new LinkedHashSet<>();

        for (int i = 1; i <= s.length(); i++) { // длина подстроки
            for (int j = 0; j <= s.length() - i; j++) { // индекс отсчета
                for (int k = j + 1; k + i - 1 <= s.length(); k++) { // перебор от индекса
                    if (!set.add(s.charAt(j) + s.substring(k, k + i - 1))) {
                        break;
                    }
                }
            }
        }
        System.out.println(set);
    }
}
