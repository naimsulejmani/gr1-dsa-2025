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

    /**
     * Recursively inserts a new node into the binary search tree.
     *
     * @param root    the root node of the current subtree
     * @param newNode the new node to be inserted
     */
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


    public void inOrderTraversal() {
        inOrderRec(root);
    }

    public void inOrderRec(Node<T> root) {
        if (root == null) {
            return;
        }
        inOrderRec(root.getLeft());//shko gjithmon ne anen e majte - M
        System.out.println(root.getData()); // Rr
        inOrderRec(root.getRight()); //shko ne anen e djathte - D
    }


    public void preOrderTraversal() {
        preOrderRec(root);
    }

    private void preOrderRec(Node<T> root) {
        if (root == null) {
            return;
        }
        // RR, M, D
        System.out.println(root.getData()); // Rr - vizito
        preOrderRec(root.getLeft()); // M - shko ne anen e majte
        preOrderRec(root.getRight()); // D - shko ne anen e djathte
    }

    public void postOrderTraversal() {
        postOrderRec(root);
    }

    private void postOrderRec(Node<T> root) {
        if (root == null) {
            return;
        }
        postOrderRec(root.getLeft()); // M - shko ne anen e majte
        postOrderRec(root.getRight());// D - shko ne anen e djathte
        System.out.println(root.getData()); // Rr - vizito
    }


}






