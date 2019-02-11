package hillel.plyska.old.lesson6.lesson2;

import static hillel.plyska.utils.Common.initArray;

public class Task8 {

    public static void main(String[] args) {
        /*8. Определите сумму минимального и максимального элементов массива*/
       int array []  =  initArray(20);
       sumOfMinAndMaxValue(array);
    }

    private static int findMinValueInArray(int[] array) {
        int minValue = array[0];

        for (int a = 0; a < array.length; a++) {
            if (array[a] < minValue) {
                minValue = array[a];
            }
        }
        return minValue;
    }

    private static int findMaxValueInArray(int[] array) {
        int maxValue = array[0];
        for (int a = 0; a < array.length; a++) {
            if (array[a] > maxValue) {
                maxValue = array[a];
            }

        }
        return maxValue;
    }

    private static int sumOfMinAndMaxValue(int array []){
        int minValue =findMinValueInArray(array);
        int maxValue = findMaxValueInArray(array);
        return minValue+ maxValue;
    }
}
