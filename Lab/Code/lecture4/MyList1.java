public class MyList1 {
    private int value;
    private MyList1 next;

    public static void main(String[] args) {
        MyList1 list = new MyList1();
        list.value = 5;
        list.next = null;

        list.next = new MyList1();
        list.next.value = 2;

        list.next.next = new MyList1();
        list.next.next.value = 10;
    }
}
