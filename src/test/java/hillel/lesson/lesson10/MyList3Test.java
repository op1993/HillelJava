package hillel.lesson.lesson10;

import org.junit.Test;

public class MyList3Test {

    @Test
    public void addTest() {
        MyList3<String> list = new MyList3<>();
        list.add("3");
        list.add("2");
        list.add("1");
        System.out.println(list.get(0));
    }
}