package Listy;



public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }
}

class ExtLinkedList<T> {

    private Node<T> root;

    public void addFirst(T value) {
        //scenariusz 1: dodawanie elementy do pustej listy
        if (root == null) {
            root = new Node<>(value);
            return;
        }
        //scenariusz 2: dodowanei elementy to istniejącej listy
        Node<T> node = new Node<>(value);
        node.setNext(root);
        root = node;
    }
    public void addLast(T value){
        if (root == null) {
            root = new Node<>(value);
            return;
        }
        //scenariusz 2: dodowanei elementy to istniejącej listy
        Node<T> head =  root;
        while (head.getNext() != null) {
            head = head.getNext();
        }
        Node<T> node = new Node<>(value);
        head.setNext(node);
    }

    public void showAll() {
        Node<T> head = root;
        while (head != null) {
            System.out.println(head.getValue());
            head = head.getNext();
        }
    }

    public static void main(String[] args) {
        ExtLinkedList<Integer> integerExtLinkedList = new ExtLinkedList<>();
        integerExtLinkedList.addFirst(1);
        integerExtLinkedList.addFirst(2);
        integerExtLinkedList.addFirst(3);
        integerExtLinkedList.addFirst(4);
        integerExtLinkedList.addLast(1);
        integerExtLinkedList.addLast(2);
        integerExtLinkedList.addLast(3);
        integerExtLinkedList.addLast(4);
        integerExtLinkedList.showAll();
    }
}
