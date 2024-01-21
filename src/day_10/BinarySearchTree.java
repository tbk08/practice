package day_10;

public class BinarySearchTree {
    Node root;

    // Конструктор
    public BinarySearchTree() {
        root = null;
    }

    // Метод для вставки нового значения в дерево
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Рекурсивный метод для вставки значения в дерево
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }
    void printInorder() {
        System.out.println("Узлы дерева в порядке возрастания ключей (inorder обход):");
        inorderRec(root);
    }

    // Рекурсивный метод для inorder обхода дерева и вывода на экран
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }


}

