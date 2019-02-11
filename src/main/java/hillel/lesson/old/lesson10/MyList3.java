package hillel.lesson.old.lesson10;

import java.util.*;
import java.util.function.Consumer;

public class MyList3 <E> implements List<E> {
    private MyList3.Node<E> head;

    @Override
    public int size() {
        int a =0;
        for (MyList3.Node<E> node = head; node !=null ; node = node.next){
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
        for (MyList3.Node<E> node = head; node !=null ; node = node.next){
            if (Objects.equals(node.value,obj)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            MyList3.Node<E> node = head;

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
        private MyList3.Node<T> next;

        public T getValue() {
            return value;
        }

        public Node(T value, MyList3.Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
            this.value = value;
        }
    }

    public boolean add(E e) {
        MyList3.Node<E> tail = tail();
        if (tail == null) {
            head = new MyList3.Node<>(e);
        } else {
            head = new MyList3.Node<>(e, head);
        }
        return  true;

    }

    @Override
    public boolean remove(Object o) {
        MyList3.Node<E> node = head;
        MyList3.Node<E> prev = null;

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
    public boolean addAll(int index, Collection<? extends E> c) {
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

    @Override
    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = head;

        int i = 0;
        while (node != null && i != index) {
            node = node.next;
            i++;
        }
        return node.value;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    public void print() {
        for (MyList3.Node<E> node = head; node != null; node = node.next) {
            System.out.println(node.value);
        }
    }

    public MyList3.Node<E> tail() {
        MyList3.Node<E> node = head;
        while (node != null && node.next != null) {
            node = node.next;
        }
        return node;
    }

    void iterate(Consumer<E> consumer) {
        for (MyList3.Node<E> node = head; node != null; node = node.next) {
            consumer.accept(node.value);
        }
    }
}