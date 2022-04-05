package com.company;

import java.util.Scanner;

public class Fifth {
    public static void  main(String[] args){
        String[] sc = new String[2];
        for(int i = 0; i < 2; i++) {
            Scanner can = new Scanner(System.in);
            sc[i] = can.nextLine();
        }
        if(sc[0].length() == sc[1].length()){
            System.out.println("Рівні");
        }if(sc[0].length()>sc[1].length()){
            System.out.println("Перший більший");
        }if(sc[0].length()<sc[1].length()){
        System.out.println("Другий більший");
        }
    }

}
