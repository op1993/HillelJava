package hillel.plyska.old.lesson6.lesson1.task1;

import java.util.Random;

public class FirstHomeWork {


    public static void main(String[] args) {
        FirstHomeWork firstHomeWork = new FirstHomeWork();
        int array[][] = firstHomeWork.fillArray(-10, 100, 0, 1);
        firstHomeWork.printValuesFromArray(array);

        firstHomeWork.printNameAndSurname();


    }

    public int[][] fillArray(int sizeA, int sizeB, int minValue, int maxValue) {
        if (sizeA <= 0 || sizeB <= 0 ) {
            try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Value \"sizeA\" and \"sizeB\"  should be  >  0" +
                    " \nCurrent  sizeA  = " + sizeA + " " +
                    " \nCurrent value for sizeB  = " + sizeB
            );
        }
    }
        if (minValue < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Min value should be  >=  0");
            }
        }

        int array[][] = new int[sizeA][sizeB];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(maxValue - minValue + 1);
            }
        }
        return array;
    }

    public void printValuesFromArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printNameAndSurname() {
        System.out.println("*******   *******");
        System.out.println("**   **   **   **");
        System.out.println("**   **   **   **");
        System.out.println("**   **   *******");
        System.out.println("**   **   **     ");
        System.out.println("**   **   **     ");
        System.out.println("*******   **     ");
    }


}
