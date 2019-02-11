package hillel.plyska.old.lesson6.lesson2;
import static hillel.plyska.utils.Common.initArray;

public class Task6 {

    public static void main(String[] args) {
        //    6. Найдите сумму элементов массива
      int [] array=   initArray(5);
        System.out.println(countArraySum(array));
    }

    private static int countArraySum(int [] array){
        int sum = 0;
        for (int a =0; a < array.length; a++){
            sum += array[a];
        }
        return sum;
    }

}
