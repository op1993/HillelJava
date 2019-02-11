package hillel.plyska.old.lesson6.lesson2;


public class Task1 {

    public static void main(String[] args) {
        /*1. Выведите первые 5 элементов массива, у которого размер 10*/
       int [] array = initArray(10);
       printFirstNElementsFromArray(array,5);
    }

    private static int [] initArray(int length){
        int array[] = new int[length];
        for (int a =0; a < length ; a++){
            array[a] = a+1;
        }
        return array;
    }

    private static void printFirstNElementsFromArray(int [] array, int maxElement){
        for (int a = 0; a < array.length; a++){
            if (a<5){
                System.out.println(array[a]);
            }
            else break;
        }
    }

}

