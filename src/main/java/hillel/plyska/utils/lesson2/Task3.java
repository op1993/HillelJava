package hillel.plyska.utils.lesson2;

public class Task3 {
    public static void main(String[] args) {
        /*3. Создайте массив размером n, элементами которого будут числа от n до 1*/
    createArray(0f, 0.1f);
    }

    private static float []  createArray(float minValue, float step){
        float array [] = null;
        for (float a=0; a <= 1; a +=step) {
            System.out.println(a);
        }

        return array;
    }

}
