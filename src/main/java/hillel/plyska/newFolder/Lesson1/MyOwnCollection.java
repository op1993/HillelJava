package hillel.plyska.newFolder.Lesson1;

import com.sun.xml.bind.v2.TODO;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyOwnCollection implements Collection {

    private Object[] objects = new Object[0];

    @Override
    public int size() {
        return objects.length;
    }


    @Override
    public boolean isEmpty() {
        return objects.length ==0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object ob: objects) {
            if (ob.equals(o)){
                return true;
            }
        }
        return  false;
    }

    //TODO
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return objects;
    }

    @Override
    public boolean add(Object o) {
        int newSize = objects.length+1;
        Object [] newArray = new Object[newSize];
        for (int a=0; a < objects.length;a++){
            newArray[a]= objects[a];
        }
        newArray[objects.length] = o;
        objects = newArray;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (!contains(o)){
            return false;
        }
        Object [] newArray = new Object[objects.length-1];
        int b = 0;
        for (int a = 0; a< objects.length; a++){
            if (!objects[a].equals(o)){
                newArray[b] = objects[a];
                b++;
            }
        }
        objects= newArray;
        return true;

    }

    @Override
    public boolean addAll(Collection c) {
        Object [] tempArray = c.toArray();
        for (Object ob: tempArray){
            add(ob);
        }
        return true;
    }

    @Override
    public void clear() {
        objects = new Object[0];
    }

    //TODO
    @Override
    public boolean retainAll(Collection c) {
//        Object [] tempArray  = c.toArray();
        if (!containsAll(c)){
            return false;
        }
        objects = c.toArray();
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        Object [] temp =  c.toArray();
        for(Object o: temp) {
            if (!contains(o)) {
                return  false;
            }
        }
        for (Object object: temp){
            remove(object);
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        Object [] temp =  c.toArray();
        for(Object o: temp) {
            if (!contains(o)) {
                return  false;
            }
        }
        return true;
    }

    //TODO
    @Override
    public Object[] toArray(Object[] a) {
        return a;
    }


    public static void main(String[] args) {
        MyOwnCollection  myOwnCollection = new MyOwnCollection();
        myOwnCollection.add("Test1");
        myOwnCollection.add("Test2");
//        System.out.println(myOwnCollection.remove("Test1"));
        myOwnCollection.addAll(Arrays.asList("Test 3", "Test 4"));
//        System.out.println(myOwnCollection.remove("Test22"));
//        System.out.println(myOwnCollection.contains("Testr"));
//        System.out.println(myOwnCollection.isEmpty());
//        myOwnCollection.clear();

        System.out.println(myOwnCollection.containsAll(Arrays.asList("Test22", "Test1")));
//        System.out.println("**** " + myOwnCollection.removeAll((Arrays.asList("Test1", "Test 3"))));
//        myOwnCollection.removeAll(Arrays.asList("Test1"));
        System.out.println("***************************");
       for (Object o: myOwnCollection.objects){
           System.out.println(o);
       }
    }}

