package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        float max = 0;
        float array[] = new float[3];
        for (int a = 0; a < 3; a++){
            Scanner can = new Scanner(System.in);
            System.out.println("Введіть число:");
            if (can.hasNextFloat()){
                array[a] = can.nextFloat();
                max = Math.max(array[0],Math.max(array[1], array[2]));
            }else{
                System.out.println("Ведено невірне значення.");
            }
        }System.out.println("max = " +max);
    }
}
