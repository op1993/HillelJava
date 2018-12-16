package hillel.plyska.lesson2;

public class Task2 {

    public static void main(String[] args) {
        /*2. Создайте массив размером n, элементами, которого будут числа от 1 до n*/
        initArray(200);

    }

    private static int [] initArray(int length){
        int array[] = new int[length];
        for (int a =0; a < length ; a++){
            array[a] = a+1;
        }
        return array;
    }
}
