package by.htp.jd01.unit7.service;

import by.htp.jd01.unit7.entity.Matrix;

/**
 * Created by Fisher on 12.03.2018.
 */
public class DiagonalNumberRecordingImpl2 implements Runnable {
    private Matrix matrix;
    private int numberThread;
    double[][] array;

    public DiagonalNumberRecordingImpl2(Matrix matrix, int numberThread) {
        this.matrix = matrix;
        this.numberThread = numberThread;
    }

    @Override
    public void run() {
        matrix.writeDiagonal(numberThread);
    }
}
