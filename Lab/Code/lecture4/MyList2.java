public class MyList2 {
    private int value;
    private MyList2 next;

    public MyList2(int value, MyList2 next) {
        this.value = value;
        this.next = next;
    }

    public static void main(String[] args) {
        MyList2 list = new MyList2(10, null);
        list = new MyList2(2, list);
        list = new MyList2(5, list);
    }
}
