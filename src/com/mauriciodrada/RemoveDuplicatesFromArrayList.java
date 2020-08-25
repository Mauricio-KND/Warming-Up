package com.mauriciodrada;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {

    public static RemoveDuplicatesFromArrayList instance;

    public static void main(String[] args) {
        //Input list with duplicates
        LambdaRemove();
        deleteDuplicated(Arrays.asList(2,3,4,55,4,3,22,3,4,55,6,7,87,5));
        System.out.println(inv("anitalavalatina"));


    }

    private static void reverseCrunch() {
    }

    public static RemoveDuplicatesFromArrayList getInstance() {
        if (instance == null) {
            instance = new RemoveDuplicatesFromArrayList();
        }
        return instance;
    }

    protected static void LambdaRemove() {
        List<Integer> list = Arrays.asList(1, 10, 23, 2, 3, 10, 4, 23, 5);
        System.out.println(list + " <Input List (Lambda) with duplicated numbers>");
        System.out.println(list.stream().distinct().collect(Collectors.toList()) + " <List (Lambda) without duplicated numbers>");
    }

    public static void deleteDuplicated(List<Integer> numbers) {
        //List<Integer> numbers = Arrays.asList(1, 3, 2, 6, 9, 0, 0, 5, 5, 5, 7, 8, 9);
        System.out.println(numbers + " <Input list (LinkedHashSet)>");
        System.out.println(removeDuplicates(numbers) + " <No duplicated numbers (LinkedHashSet)>");
    }

    private static ArrayList<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    private static double factBoySlim(int x){
        if (x==0){
            return 1;
        }else if (x==1){
            return 1;
        }else{
            return x * factBoySlim(x - 1);
        }
    }
    private static double factBoySlim(int x, int y){
        return factBoySlim(x + y);
    }

    private static String inv(String s) {

        // Iterating
        StringBuilder revs = new StringBuilder();
        for (int i=1; i<=s.length(); i++) {
            revs.append(s.charAt(s.length() - i));
        }
        return revs.toString();
    }
}
