package hillel.plyska.old.lesson6.lesson;

import static hillel.plyska.utils.Common.initArray;

public class Main {
    public static void main(String[] args) {
       int [] array = initArray(20);
       int [] anotherArray =  new int [0];
        for (int c=0;c<array.length;c++){
            if (array[c]%5==0){

                System.out.println("s");
            }
        }
    }
}
