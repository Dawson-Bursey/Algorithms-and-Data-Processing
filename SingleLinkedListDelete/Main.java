public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Original list:");
        list.printList();

        list.deleteNode(10);  // Case 1: Delete head
        list.printList();

        list.deleteNode(40);  // Case 2: Delete end node
        list.printList();

        list.deleteNode(20);  // Case 3: Delete middle node
        list.printList();

        list.deleteNode(50);  // Case 0: Node doesn't exist
        list.printList();
    }
}