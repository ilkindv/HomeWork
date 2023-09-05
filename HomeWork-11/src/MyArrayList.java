import java.util.Arrays;

public class MyArrayList<E> {
    private Object[] elements;
    private int size;
    private int capacity = 10;

    public MyArrayList(){
        elements = new Object[capacity];
        size = 0;
    }

    public int size(){
        return size;
    }

    public E get(int index){
        return (E) elements[index];
    }

    public void add(E element){
        if(size == capacity){
            capacity *= 2;
            elements = Arrays.copyOf(elements, capacity);
        }
        elements[size] = element;
        size++;
    }

    public void remove(int index){
        for(int i = index; i < size - 1; i++){
            elements[i] = elements[i + 1];
        }
        size--;
    }
}
