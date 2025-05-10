package trees;

public class BSTDemo {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(23);
        bst.insert(13);
        bst.insert(54);
        bst.insert(7);
        bst.insert(4);
        bst.insert(8);
        bst.insert(15);
        bst.insert(45);
        bst.insert(77);

        System.out.println("In-order traversal of the BST:");
        bst.inOrderTraversal();
        System.out.println("-----------------------------");
        System.out.println("Pre-order traversal of the BST:");
        bst.preOrderTraversal();
        System.out.println("-----------------------------");
        System.out.println("Post-order traversal of the BST:");
        bst.postOrderTraversal();
    }
}








