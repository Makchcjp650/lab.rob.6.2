package com.company;

public class Main {

    public static void main(String[] args) {
        Package a = new Package();
        a.one = 5;
        a.two = 4;
        a.three = 3;
        double c = a.one * a.three;
        double b = a.two + a.three;
        System.out.println("result : " + c);
        System.out.print("result : " + b);

    }
}
