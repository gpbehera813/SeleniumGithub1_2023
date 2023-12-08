package javaBasics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(45);
        l1.add(35);
        l1.add(30);

        System.out.println(l1);

        l1.add(20);

        System.out.println(l1);


    }



}
