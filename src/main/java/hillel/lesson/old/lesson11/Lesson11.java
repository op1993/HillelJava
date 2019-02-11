package hillel.lesson.old.lesson11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Lesson11 {
    int a;
    int b;

    @Override
    public String toString() {
        return "Lesson11{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public Lesson11(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson11 lesson11 = (Lesson11) o;
        return a == lesson11.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    public static void main(String[] args) throws IOException {
      Properties properties = new Properties();

      properties.load(new FileInputStream("\\resources\\ololo.properties"));
      String pass = properties.getProperty("password");
        System.out.println(pass);

    }

    private static void stack() {
        Stack<Lesson11> stack =new Stack<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10 ; j++) {
                stack.push(new Lesson11(i,j));
            }
        }

        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }


    private static void linkedHashMap() {
        Map<Lesson11,Integer> map = new LinkedHashMap<>();
        Lesson11 a = new Lesson11(3,1);
        Lesson11 a1 = new Lesson11(2,1);
        Lesson11 a2 = new Lesson11(1,2);
        Lesson11 a3 = new Lesson11(1,2);


        map.put(a,0);
        map.put(a1,1);
        map.put(a2,2);
        map.put(a3,3);

        for (Map.Entry<Lesson11, Integer> map1 : map.entrySet()){
            System.out.println(map1 +  "" + map1.getKey() + " " + map1.getValue());

        }
    }


    private static void set() {
        Set<Lesson11> set = new TreeSet<>((o1, o2) -> {
            long a = (o1.getA()) * Integer.MAX_VALUE+ o1.getB();
            long b = (o2.getA()) * Integer.MAX_VALUE + o2.getB();
            if (a > b) {
                return 1;
            }
            else if (a<b){
                return -1;
            }
            return 0;

        });
        set.add(new Lesson11(1,2));
        set.add(new Lesson11(3,4));
        set.add(new Lesson11(4,55));


        System.out.println(set.size());
    }

}



