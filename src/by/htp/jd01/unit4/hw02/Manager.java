package by.htp.jd01.unit4.hw02;

import java.util.Random;
import java.util.Scanner;

public class Manager {
    private Abiturient[] abiturients;

    public void initAbiturient(int amount) {
        abiturients = new Abiturient[amount];
        for (int i = 0; i < amount; i++) {
            abiturients[i] = new Abiturient("Surname-" + i, "Name-" + i, i + 15, ((i <= 3) && (i > 8)) ? true : false);
            abiturients[i].setMark(initMark());
            abiturients[i].setAvarageMark(getAvarageAbiturientScore(i));
        }
    }

    // initial marks for every abiturients
    public int[] initMark() {
        Random random = new Random();
        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = 2 + random.nextInt(4);
        }

        return array;
    }

    public double getAvarageAbiturientScore(int i) {
        double sum = 0;
        double avarage = 0;

        for (int j = 0; j < abiturients[i].getMark().length; j++) {
            sum = sum + abiturients[i].getMark()[j];
        }

        return (sum / abiturients[i].getMark().length);
    }

    public Abiturient[] sortArray(Abiturient[] array) {
        Abiturient temp = null;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].getAvarageMark() < array[j].getAvarageMark()) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    public void receivedAbiturient(int numberPlace) {
        Abiturient[] array = sortArray(abiturients);

        if (numberPlace < abiturients.length) {
            for (int i = 0; i < numberPlace; i++) {
                        System.out.printf(
                                array[i].getSurname() + " " + array[i].getName() + " %.2f received",
                                array[i].getAvarageMark());
                        System.out.println();
            }
        } else {
            System.out.println("Received all abiturients");
        }
    }

    public int enterNumber(String message) {
        int number;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print(message);
            while (!sc.hasNextInt()) {
                System.out.print(message);
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);

        return number;
    }

    public void showAbiturient() {
        for (int i = 0; i < abiturients.length; i++) {
            System.out.println(abiturients[i].getSurname() + " " + abiturients[i].getName() + " " + abiturients[i].getAvarageMark());
        }
    }

}
