package hillel.plyska.lesson1;

public class ThirdNumber {

    public static void main(String[] args) {
        System.out.println(args[0]);
        int num7=8;
        int num8=6;
        boolean b1 = num7>num8;

        if( method1(num7) || b1){

            System.out.println("first yes");
        }
        System.exit(-1);

        System.out.printf("Blab blab %d", num7);
    }

    private static  boolean method1(int num7){
        System.out.println("method1");
        return num7> 7;

    }
}
