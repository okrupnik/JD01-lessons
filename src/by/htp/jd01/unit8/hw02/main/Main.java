package by.htp.jd01.unit8.hw02.main;

import by.htp.jd01.unit8.hw02.entity.Matrix;
import by.htp.jd01.unit8.hw02.service.EnterData;
import by.htp.jd01.unit8.hw02.service.SumMatrixManyThreadImpl;
import by.htp.jd01.unit8.hw02.service.SumMatrixTwoThreadImpl;

import java.util.Arrays;

/**
 * Created by Fisher on 16.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        int size = 0;
        int numberThread = 0;
        int choosingOfThreads = 0;
        Thread[] threads = null;

        size = EnterData.enterData("Enter correct size of array: ");
        Matrix matrix = new Matrix(size);
        choosingOfThreads = EnterData.chooseData("Choose number of threads (1 - many threads; 2 - two threads): ");
        System.out.println("______________________________________________________________________________________");

        if (choosingOfThreads == 1) {
            numberThread = size;

            threads = new Thread[numberThread];

            for (int i = 0; i < threads.length; i++) {
                threads[i] = new Thread(new SumMatrixManyThreadImpl(matrix, i));
                threads[i].start();
            }
        } else {
            numberThread = 2;

            threads = new Thread[numberThread];

            for (int i = 0; i < threads.length; i++) {
                threads[i] = new Thread(new SumMatrixTwoThreadImpl(matrix, i));
                threads[i].start();
            }
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("______________________________________________________________________________________");
        for (int i = 0; i < size; i++) {
            if (i == size / 2) {
                System.out.println(Arrays.toString(matrix.getArrayFirst()[i]) + "  +  " + Arrays.toString(matrix.getArraySecond()[i]) + "  =  " + Arrays.toString(matrix.getArrayResult()[i]));
            } else {
                System.out.println(Arrays.toString(matrix.getArrayFirst()[i]) + "     " + Arrays.toString(matrix.getArraySecond()[i]) + "     " + Arrays.toString(matrix.getArrayResult()[i]));
            }
        }
    }
}
