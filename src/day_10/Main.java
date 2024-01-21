package day_10;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(20);
        tree.insert(23);
        tree.insert(14);
        tree.insert(16);
        tree.insert(27);
        tree.insert(22);
        tree.insert(24);
        tree.insert(150);
        tree.insert(15);
        tree.insert(18);
        tree.insert(11);
        tree.insert(5);
        tree.insert(8);

        tree.printInorder();
    }
}
