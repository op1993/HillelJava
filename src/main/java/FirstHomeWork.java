import java.util.Random;

public class FirstHomeWork {


    public int [][] fillArray(int sizeA ,int sizeB, int minValue, int maxValue){
        int array [][] = new int[sizeA][sizeB];
        for (int i =0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                array [i][j] = new Random().nextInt(maxValue-minValue+1);
            }
        }
        return array;
    }

    public void printValuesFromArray(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FirstHomeWork firstHomeWork =  new FirstHomeWork();
        int array [][] = firstHomeWork.fillArray(10,10,0,100);
        firstHomeWork.printValuesFromArray(array);

        firstHomeWork.printNameAndSurname();
    }

    public void printNameAndSurname(){
        System.out.println("*******   *******");
        System.out.println("**   **   **   **");
        System.out.println("**   **   **   **");
        System.out.println("**   **   *******");
        System.out.println("**   **   **     ");
        System.out.println("**   **   **     ");
        System.out.println("*******   **     ");
    }


}
