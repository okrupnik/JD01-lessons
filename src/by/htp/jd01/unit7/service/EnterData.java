package by.htp.jd01.unit7.service;

import java.util.Scanner;

/**
 * Created by Fisher on 12.03.2018.
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
}
