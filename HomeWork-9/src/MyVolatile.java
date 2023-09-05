public class MyVolatile {
    private  volatile boolean door = false;
    public void open(){
        door = !door;
    }
    public boolean isOpen(){
        return door;
    }
}
