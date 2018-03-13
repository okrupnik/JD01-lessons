package by.htp.jd01.unit7.main;

import by.htp.jd01.unit7.entity.Matrix;
import by.htp.jd01.unit7.service.DiagonalNumberRecordingImpl2;
import by.htp.jd01.unit7.service.EnterData;

/**
 * Created by Fisher on 12.03.2018.
 */
public class Main2 {
    public static void main(String[] args) {
        int size = 0;
        int numberThread = 0;

        size = EnterData.enterData("Enter correct size array:");
        Matrix matrix = new Matrix(size);

        numberThread = EnterData.enterData("Enter correct number of thread:");

        Thread[] threads = new Thread[numberThread];
        for (int i = 0; i < numberThread; i++) {
            threads[i] = new Thread(new DiagonalNumberRecordingImpl2(matrix, i + 1));
            threads[i].start();
        }
        while (matrix.getArray()[size-1][size-1] == 0) {
            synchronized (matrix) {
                matrix.notifyAll();
            }
        }
    }
}
