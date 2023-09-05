public class MyGeneric<T,E> {
    private T value;
    private E key;

    public MyGeneric(T value, E key) {
        this.value = value;
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "MyGeneric{" +
                "value=" + value +
                ", key=" + key +
                '}';
    }
}
