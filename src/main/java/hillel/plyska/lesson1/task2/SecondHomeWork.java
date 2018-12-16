package hillel.plyska.lesson1.task2;

import java.util.Arrays;
import java.util.Random;

public class SecondHomeWork {

    public static void main(String[] args) {
        SecondHomeWork secondHomeWork = new SecondHomeWork();
//        int array[] = {1, 20, 3, 4, 5, 5, 6, 7, 5, 8, 11, 20, 22, 11, 1};
//        secondHomeWork.printFirstFiveElementsFromArray(array, 6);

//        int a =6;
//        int b = 4;
//        System.out.println(a%b);
//        factorial();
//        System.out.println(Math.pow(2,10));
        System.out.println(7/10);

//
  }

    public int[] fillArray(int sizeA, int minValue, int maxValue) {
        int array[] = new int[sizeA];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(maxValue - minValue + 1);
        }
        return array;
    }

    public int findMinValueInArray(int[] array) {
        int minValue = array[0];

        for (int a = 0; a < array.length; a++) {
            if (array[a] < minValue) {
                minValue = array[a];
            }
        }
        return minValue;
    }

    public int findMaxValueInArray(int[] array) {
        int maxValue = array[0];
        for (int a = 0; a < array.length; a++) {
            if (array[a] > maxValue) {
                maxValue = array[a];
            }
        }
        return maxValue;
    }

    public int indexOfElementInArray(int element, int[] array) {
        for (int a = 0; a < array.length; a++) {
            if (array[a] == element) {
                return a;
            }
        }
        return -1;
    }

    public int indexOfElement(int element, int array[]) {
        return Arrays.asList(array).indexOf(element);
    }

    public int sumOfArray(int array[]) {
        int sum = 0;
        for (int a = 0; a < array.length; a++) {
            sum = sum + array[a];
        }
        return sum;
    }

    public int[] fillArrayFromNToMax(int arraySize, int maxArrayValue) {
        int[] temp = new int[arraySize];
        int maxValue = maxArrayValue;
        int minValue = 1;

        for (int a = 0; a < temp.length; a++) {
            temp[a] = new Random().nextInt(maxValue - minValue) + minValue;
        }
        return temp;
    }

    public void printFirstFiveElementsFromArray(int[] array, int value) {
        int count = 0;
        for (int a = 0; a < array.length; a++) {
            if (array[a] > value && count < 5) {
                System.out.println(array[a]);
                count++;
            }
        }
    }

    public static void factorial(){
        // n! = n * (n-1)
        int value =10;
        // 1*2*3*4*5*6*7*8*9*10
        int sum = 1;
        for (int a =1; a <= value ; a++){
            sum =a*sum;
        }
        System.out.println(sum);
    }


}
