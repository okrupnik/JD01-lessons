package by.htp.jd01.unit7.entity;

public class Matrix {
    private double[][] array;

    public Matrix(int size) {
        this.array = new double[size][size];
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                this.array[i][j] = 0;
            }
        }
    }

    public double[][] getArray() {
        return this.array;
    }

    public synchronized void writeDiagonal(int numberThread) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    if (array[i][j] == 0) {
                        array[i][j] = numberThread;
                        System.out.println("The thread № " + numberThread + " writes in element array[" + i + "][" + j + "] value - " + numberThread);
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
    }
}
