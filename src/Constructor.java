public class Constructor {
    private int value;

    public Constructor(int value) {
        this.value = value;
    }

    public Constructor() {
        this.value = 0;
    }

    /**
     * The click method will increase the value by 1
     */
    public void click(){
        value = value + 1;
    }
    /**
     * The method will return the current value
     * @return the current value
     */
    public int getValue(){
        return value;
    }
}
