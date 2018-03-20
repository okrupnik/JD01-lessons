package by.htp.jd01.unit8.hw01.service;

import by.htp.jd01.unit8.hw01.entity.Matrix;

/**
 * Created by Fisher on 12.03.2018.
 */
public class DiagonalNumberRecordingImpl implements Runnable {
    private Matrix matrix;
    private int numberThread;
    double[][] array;

    public DiagonalNumberRecordingImpl(Matrix matrix, int numberThread) {
        this.matrix = matrix;
        this.numberThread = numberThread;
    }

    @Override
    public void run() {
        synchronized (matrix) {
            array = matrix.getArray();
            for (int i = 0; i < array.length; i++) {
                if (array[i][i] == 0) {
                    array[i][i] = numberThread;
                    System.out.println("The thread № " + numberThread + " writes in element array[" + i + "][" + i + "] value - " + numberThread);
                    try {
                        Thread.sleep(300);
                        matrix.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
