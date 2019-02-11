package hillel.plyska.utils.lesson2;

import static hillel.plyska.utils.Common.initArray;

public class Task7 {
    public static void main(String[] args) {
//        7. Найдите среднее арифметическое элементов массива
        int [] array = initArray(20);
        System.out.println(averageArrayValue(array));

    }

    private static float averageArrayValue(int array []){
        float sum = 0 ;
        for (int a =0; a < array.length;a++){
            System.out.println("element  = " + array[a]);
            sum += array[a];
        }
        return (sum/array.length) ;
    }
}
