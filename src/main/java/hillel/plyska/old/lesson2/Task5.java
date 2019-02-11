package hillel.plyska.old.lesson6.lesson2;

import static hillel.plyska.utils.Common.initArray;

public class Task5 {
    public static void main(String[] args) {
        /*5. Выведите все четные элементы массива*/
       int array [] =  initArray(33);
        printEvenNumbers(array);
    }
    private static void printEvenNumbers(int [] array){
        for (int a =0; a < array.length ; a++){
            if (array[a]%2 ==0){
                System.out.println(array[a]);
            }
        }
    }
}
