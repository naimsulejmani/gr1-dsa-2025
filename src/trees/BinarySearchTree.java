package trees;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;
    private int size;

    public BinarySearchTree() {
        //default constructor
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            root = newNode;
        } else {
            //recursive insert
            insertRec(root, newNode);
        }
        size++;
    }

    public void insertRec(Node<T> root, Node<T> newNode) {
        if (newNode.getData().compareTo(root.getData()) <= 0) {
            if (root.getLeft() == null) {
                root.setLeft(newNode);
            } else {
                insertRec(root.getLeft(), newNode);
            }
        } else {
            if (root.getRight() == null) {
                root.setRight(newNode);
            } else {
                insertRec(root.getRight(), newNode);
            }
        }
    }

}






