package by.htp.jd01.unit8.hw01.entity;

public class Matrix {
    private double[][] array;

    public Matrix(int size) {
        this.array = new double[size][size];
    }

    public double[][] getArray() {
        return this.array;
    }

    public synchronized void writeDiagonal(int numberThread) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] == 0) {
                array[i][i] = numberThread;
                System.out.println("The thread № " + numberThread + " writes in element array[" + i + "][" + i + "] value - " + numberThread);
                try {
                    Thread.sleep(300);
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
