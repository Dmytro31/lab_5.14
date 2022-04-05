package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введіть п'ять слів");
        int a = 1;
        String [] s = new String[5];
        for(int i = 0; i < 5; i++) {
            Scanner can = new Scanner(System.in);
            a++;
            s[i] = can.nextLine();
        }
        System.out.println(s[0] +" "+ s[1] +" " +s[2] +" " +s[3] +" "+s[4]);

    }
}
