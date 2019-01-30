package hillel.plyska.lesson11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task5 {
/*
    Дан список с числами и еще одно число. Определить  за один проход можно ли из двух чисел в списке составить  число.
    к примеру List.of(8,3,4,5,1) и число 13 программа должна вывести индексы 0 и 3
    если 20 - то программа должна сообщить то такой комбинации нет.*/

    public static void main(String[] args) {
        List<Integer>  list=  List.of(8,3,4,5,1);
        int maxValue = 49;
        printIfSumFound(list, maxValue);


    }

    private static void printIfSumFound(List<Integer> list, int maxValue) {
        Map<Integer , Integer> map =  new HashMap<>();
        boolean isMatched = false;
        for (int a =0;  a < list.size();a++){
            int restOfValue = maxValue-list.get(a);
            if (map.containsKey(list.get(a))){
                System.out.println(map.get(list.get(a)) + "  " +  a
                );
                isMatched= true;
                break;
            }
            map.put(restOfValue,a);
        }
        if (isMatched==false){
            System.out.println("Not Found");
        }
    }

}
