package javaBasics;

public class Loops {

    public static void main(String[] args) {

        int [] a = {56,78,90,100};
        String [] b = {"Guru","LearnMore"};

        for (int i = 0; i< a.length; i++){

            System.out.println(a[i]);
        }
        for (int j = 0; j< b.length; j++){

            System.out.println(b[j]);

        }
        for (int num: a){

            System.out.println(num);
        }
        for (String s : b){

            System.out.println(s);
        }


    }

}
