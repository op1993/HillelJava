package hillel.plyska.utils;

public class Common {
    public static int [] initArray(int length){
        int array[] = new int[length];
        for (int a =0; a < length ; a++){
            array[a] = a;
        }
        return array;
    }
}
