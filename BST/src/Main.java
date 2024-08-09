//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BST b = new BST();
        b.insert(15);
        b.insert(14);
        b.insert(17);
        b.insert(18);
        b.insert(20);
        b.printEvenNodes();
        System.out.println();
        b.printOddNodes();
    }
}