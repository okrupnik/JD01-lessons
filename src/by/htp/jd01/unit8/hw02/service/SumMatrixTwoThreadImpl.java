package by.htp.jd01.unit8.hw02.service;

import by.htp.jd01.unit8.hw02.entity.Matrix;

/**
 * Created by Fisher on 16.03.2018.
 */
public class SumMatrixTwoThreadImpl implements Runnable {
    private Matrix matrix;
    private int numberThread;

    public SumMatrixTwoThreadImpl(Matrix matrix, int numberThread) {
        this.matrix = matrix;
        this.numberThread = numberThread;
    }

    @Override
    public void run() {
        matrix.sumMatrixTwoTread(numberThread);
    }
}
