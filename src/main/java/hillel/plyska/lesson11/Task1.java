package hillel.plyska.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
//    Реализовать рекурсивную функцию выпрямления списка.

    public static void main(String[] args) {
//        Реализовать рекурсивную функцию выпрямления списка.
        List<Object> list = List.of(1, 2, List.of(3, List.of(4, 5, 6)), 6);
        List<Object> result = flatten(list);
        for (Object o:result){
            System.out.println(o);
        }

    }

    private static List<Object> flatten(List<Object> list) {
        ArrayList<Object> objects = new ArrayList<>();
        for (Object o : list) {
            if (o instanceof List) {
                List<Object> flatten = flatten((List<Object>) o);
                objects.addAll(flatten);
            } else {
                objects.add(o);
            }
        }
        return objects;
    }



}