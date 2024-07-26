import java.util.Arrays;
public class Main {
    public static void main(String[] arg)
    {
        myLinkedList l1 = new myLinkedList();
        l1.addBack(10);
        l1.addBack(20);
//        l1.addBack(30);
//        l1.addBack(40);
        l1.swapFirstLast();
        l1.print();

    }
}