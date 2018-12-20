package hillel.lesson.lesson10;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyListTest2 {

    @Test
public void addTest(){
    MyList2<String> list = new MyList2<>();
    list.add("3");
    list.add("2");
    list.add("1");
    assertTrue(list.size() ==3);
        assertTrue(list.contains("3"));
}
}
