package com.company;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        String [] s = new String[5];
        System.out.println("Введіть п'ять слів");
        for(int i = 0; i < 5; i++){
            Scanner can = new Scanner(System.in);
            s[i] = can.nextLine();
        }
        System.out.println(s[0].substring(0,1));
        System.out.println(s[1].substring(0,1));
        System.out.println(s[2].substring(0,1));
        System.out.println(s[3].substring(0,1));
        System.out.println(s[4].substring(0,1));
    }
}
