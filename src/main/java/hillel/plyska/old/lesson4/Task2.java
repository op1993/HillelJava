package hillel.plyska.old.lesson6.lesson4;

import java.util.List;

public class Task2 {
    /*2. даны 10 баночек с таблетками и известно что все кроме одной содержат таблетки весом 10 миллиграмм одна содержит
    таблетки весом 11 миллиграм.
    Так же даны медицинские весы которые показываю точный вес.
    Придумать и описать как с помощью одного взвешивания определить баночку в которой не стандартный вес таблеток.
*/

    public static void main(String[] args) {

        List<Integer> bottles =  List.of(10,10,10,11,10,10,10,10,10,10,10,10,10,10,10);
        int sum = 0;
        int maxSumOfBottle=    findSumOfBottles(bottles.size(),10);

        for (int a =1; a < bottles.size();a++){
            sum += bottles.get(a) *a;
        }
        System.out.print("Bottle : ");
        System.out.println(sum - maxSumOfBottle  + 1);

    }

    private static  int findSumOfBottles(int amount,int weight){
        int sum = 0;
        for (int  a= 0;a < amount; a++){
            sum += a*weight;
        }
        return sum;

    }
}
