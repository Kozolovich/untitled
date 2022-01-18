package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("mass.txt"));
        int count = 0;
        while(sc.hasNextInt())
        {
            if (sc.nextInt() % 3 == 0) {
                count++;

            }
        }


        System.out.print("Количество чисел: " + count + ";");

    }
}
