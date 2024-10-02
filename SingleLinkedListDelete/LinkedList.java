class LinkedList {
    Node head;

    // Delete a node with a specific value
    void deleteNode(int value) {
        if (head == null) {
            System.out.println("List is empty. No nodes to delete.");
            return;
        }

        if (head.data == value) {
            head = head.next; // Move head to the next node
            System.out.println("Node with value " + value + " deleted at the beginning.");
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current.data != value) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node with value " + value + " not found.");
            return;
        }

        if (current.next == null) {
            previous.next = null;
            System.out.println("Node with value " + value + " deleted at the end.");
            return;
        }

        previous.next = current.next;
        System.out.println("Node with value " + value + " deleted from the middle.");
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


