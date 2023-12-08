package javaBasics;

public class MethodOverriding extends MethodOverloading {

    public static void main(String[] args) {

       MethodOverriding ovr = new MethodOverriding();


       ovr.m2();

    }

    public void m2(){

        System.out.println("Hello MethodOverriding");

    }


}
