package hillel.lesson.lesson10;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;

public class MyList2 <E> implements Collection<E> {
    private MyList2.Node<E> head;

    @Override
    public int size() {
        int a =0;
        for (MyList2.Node<E> node = head; node !=null ; node = node.next){
            a++;
        }
        return a;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object obj) {
        for (MyList2.Node<E> node = head; node !=null ; node = node.next){
            if (Objects.equals(node.value,obj)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            MyList2.Node<E> node = head;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public E next() {
                E value = node.value;
                node = node.next;
                return value;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    static class Node<T> {
        private T value;
        private MyList2.Node<T> next;

        public T getValue() {
            return value;
        }

        public Node(T value, MyList2.Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
            this.value = value;
        }
    }

    public boolean add(E e) {
        MyList2.Node<E> tail = tail();
        if (tail == null) {
            head = new MyList2.Node<>(e);
        } else {
            head = new MyList2.Node<>(e, head);
        }
        return  true;

    }

    @Override
    public boolean remove(Object o) {
        MyList2.Node<E> node = head;
        MyList2.Node<E> prev = null;

        while (node != null ) {
            if (Objects.equals(node.value,o)){
                if (prev == null){
                    head = node.next;
                }
                else {
                    prev.next = node.next;
                }
            }

                prev = node;
                node = node.next;
            }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for(Object o: c){
            if (!contains(o)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        head=null;
    }

    public void print() {
        for (MyList2.Node<E> node = head; node != null; node = node.next) {
            System.out.println(node.value);
        }
    }

    public MyList2.Node<E> tail() {
        MyList2.Node<E> node = head;
        while (node != null && node.next != null) {
            node = node.next;
        }
        return node;
    }

    void iterate(Consumer<E> consumer) {
        for (MyList2.Node<E> node = head; node != null; node = node.next) {
            consumer.accept(node.value);
        }
    }
}

