package by.htp.jd01.unit8.hw02.entity;

import by.htp.jd01.unit8.hw02.service.EnterData;

/**
 * Created by Fisher on 16.03.2018.
 */
public class Matrix {
    private int[][] arrayFirst;
    private int[][] arraySecond;
    private int[][] arrayResult;

    public Matrix(int size) {
        this.arrayFirst = EnterData.createArrayAutomatically(size);
        this.arraySecond = EnterData.createArrayAutomatically(size);
        this.arrayResult = new int[size][size];
    }

    public void sumMatrixManyTread(int numberThread) {
        int i = numberThread;
        System.out.println("The thread № " + (numberThread + 1) + " works!");
        for (int j = 0; j < this.arrayFirst[i].length; j++) {
            this.arrayResult[i][j] = this.arrayFirst[i][j] + this.arraySecond[i][j];
        }
        try {
            Thread.sleep(Math.abs(789 - 113 * numberThread));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The thread № " + (numberThread + 1) + " finished work!");
    }

    public void sumMatrixTwoTread(int numberThread) {
        int endFirstThread = this.arrayFirst.length / 2;
        if (numberThread == 0) {
            System.out.println("The thread № " + (numberThread + 1) + " works!");
            for (int i = 0; i < endFirstThread; i++) {
                for (int j = 0; j < this.arrayFirst[i].length; j++) {
                    this.arrayResult[i][j] = this.arrayFirst[i][j] + this.arraySecond[i][j];
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("The thread № " + (numberThread + 1) + " finished work!");
        } else if (numberThread == 1){
            System.out.println("The thread № " + (numberThread + 1) + " works!");
            for (int i = endFirstThread; i < this.arrayFirst.length; i++) {
                for (int j = 0; j < this.arrayFirst[i].length; j++) {
                    this.arrayResult[i][j] = this.arrayFirst[i][j] + this.arraySecond[i][j];
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("The thread № " + (numberThread + 1) + " finished work!");
        }

    }

    public int[][] getArrayFirst() {
        return arrayFirst;
    }

    public int[][] getArraySecond() {
        return arraySecond;
    }

    public int[][] getArrayResult() {
        return arrayResult;
    }
}
