package hillel.lesson.lesson10;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyListTest {

    @Test
    public void addTest(){
       MyList<String> list = new MyList<>();
       list.add("3");
       list.add("2");
       list.add("1");
       list.print();
        System.out.println("-----------");
        MyList.Node<String> tail =list.tail();
        System.out.println(tail.getValue());

        System.out.println("-------------");
        for (String s: list){
            System.out.println(s);
        }


        System.out.println("------");
        assertEquals("3",tail.getValue());

        list.iterate(System.out::println);



    }
}