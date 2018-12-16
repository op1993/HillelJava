package hillel.plyska.lesson2;

public class Task4 {

    public static void main(String[] args) {
        //    4. Выведите элементы массива, которые делятся на 3 без остатка
       int array [] =  initArray(20);
       printElementsWhichAreDividedWithoutFloadValue(array);
    }

    private static int [] initArray(int length){
        int array[] = new int[length];
        for (int a =0; a < length ; a++){
            array[a] = a+1;
        }
        return array;
    }

    private static void printElementsWhichAreDividedWithoutFloadValue(int [] array){
        for (int a =0; a < array.length ; a++){
            if (array[a]%3 ==0){
                System.out.println(array[a]);
            }
        }
    }

}
