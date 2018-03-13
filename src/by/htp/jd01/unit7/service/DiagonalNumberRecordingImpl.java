package by.htp.jd01.unit7.service;

import by.htp.jd01.unit7.entity.Matrix;

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
                for (int j = 0; j < array[i].length; j++) {
                    if (i == j) {
                        if (array[i][j] == 0) {
                            array[i][j] = numberThread;
                            System.out.println("The thread № " + numberThread + " writes in element array[" + i + "][" + j + "] value - " + numberThread);
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
    }
}
