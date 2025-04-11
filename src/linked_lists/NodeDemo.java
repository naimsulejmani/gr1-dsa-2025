package linked_lists;

public class NodeDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        System.out.println(node1); // default eshte si me shtyp node1.toString()

        Node node2 = new Node(2);

        node1.setNext(node2);




        Node node3 = new Node(3);
        node2.setNext(node3);

        System.out.println(node1);
    }
}














