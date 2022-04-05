package com.company;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args){
        String[] name = new String[2];
        for(int i = 0; i < 2; i++){
            Scanner can = new Scanner(System.in);
            System.out.println("Введіть ім'я ");
            name[i] = can.nextLine();
        }System.out.println(name[0].equalsIgnoreCase(name[1]));
    }
}
