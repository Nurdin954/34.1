package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> date = new ArrayList<>();
        Collections.addAll(date, 2592000, 43200, 720, 30, 4, 1);

        System.out.println("До замены: " + date);

        Collections.sort(date);
        System.out.println("После сортировки: " + date);
        
        int index = Collections.binarySearch(date, 2592000);
        System.out.println(index);

        index = Collections.binarySearch(date, 720);
        System.out.println(index);

        Collections.sort(date, Collections.reverseOrder());
        System.out.println("После обратной сортировки: " + date);



        Collections.rotate(date, 3);
        System.out.println("Перемешание элементов: "+date);

        date.set(0,42);
        date.set(1,42);
        date.set(2,42);
        date.set(3,42);
        date.set(4,42);
        date.set(5,42);
        System.out.println("Замена всех элементов в 42: "+date);









/*
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 3, -6, 11, -5, 22);
        System.out.println("До замены: " + list);
*/

    }
}
