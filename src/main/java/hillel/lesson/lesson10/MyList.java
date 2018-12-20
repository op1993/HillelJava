package hillel.lesson.lesson10;

import java.util.Iterator;
import java.util.function.Consumer;

public class MyList <E> implements  Iterable<E> {
    private Node<E> head;

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> node =head;
            @Override
            public boolean hasNext() {
                return node !=null;
            }

            @Override
            public E next() {
                E value = node.value;
                node = node.next;
                return value;
            }
        };
    }

    static class Node <T>{
        private T value;
        private Node<T> next;

        public T getValue() {
            return value;
        }

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
            this.value = value;
        }
    }

    public void add(E e){
        Node<E> tail = tail();
        if (tail == null){
            head = new Node<>(e);
        }
        else {
            head = new Node<>(e,head);
        }

    }

    public void print(){
        for (Node<E> node = head; node!=null;node = node.next) {
            System.out.println(node.value);
        }
    }

    public Node<E> tail(){
        Node <E> node  = head;
        while (node!=null && node.next !=null){
            node =  node.next;
        }
        return node;
    }

    void iterate(Consumer<E>consumer){
        for (Node<E> node = head; node!=null;node = node.next) {
            consumer.accept(node.value);
        }
    }
    public int  size(){
        int a =0;
        for (Node<E> node= head; node !=null ; node = node.next){
            a++;
        }
        return a;
    }
}
