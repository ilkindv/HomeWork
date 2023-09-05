import org.w3c.dom.Node;

public class MyLinkedList<E>{
    private Node head;
    private int size;

    public static class Node<E>{
        E data;
        Node<E> next;
        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }

    public int size(){
        return size;
    }

    public void add(E value){
        Node node = new Node(value);
        if(head == null){
            head = node;
        }else{
            Node current = head;
            while(current.next!= null){
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    public E get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return (E) current.data;
    }

    public boolean remove(E value) {
        if (head == null) {
            return false;
        }
        if (head.data.equals(value)) {
            head = head.next;
            size--;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(value)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public MyLinkedList() {
        head = null;
        size = 0;
    }
}
