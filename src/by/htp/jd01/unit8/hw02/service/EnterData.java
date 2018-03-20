package by.htp.jd01.unit8.hw02.service;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Fisher on 16.03.2018.
 */
public class EnterData {
    private static int data;

    public static int enterData(String msg) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(msg);
            while (!sc.hasNextInt()) {
                System.out.print(msg);
                sc.next();
            }
            data = sc.nextInt();
        } while (data <= 0);
        return data;
    }

    public static int chooseData(String msg) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(msg);
            while (!sc.hasNextInt()) {
                System.out.print(msg);
                sc.next();
            }
            data = sc.nextInt();
        } while (data <= 0 || data > 2);
        return data;
    }

    public static int[][] createArrayAutomatically(int size) {
        Random random = new Random();
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        return array;
    }
}
