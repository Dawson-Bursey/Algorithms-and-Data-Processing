package FromScratch;
class UndoRedoManager {
    private Node head;
    private Node current;

    public UndoRedoManager() {
        head = new Node("Start"); // Placeholder for the start
        current = head;
    }

    // Perform an action and add it to the list
    public void performAction(String action) {
        Node newNode = new Node(action);
        newNode.prev = current;
        current.next = newNode;
        current = newNode;
        System.out.println("Performed action: " + action);
    }

    // Undo the last action
    public void undo() {
        if (current.prev != null) {
            System.out.println("Undoing action: " + current.action);
            current = current.prev;
        } else {
            System.out.println("No more actions to undo.");
        }
    }

    // Redo the next action
    public void redo() {
        if (current.next != null) {
            current = current.next;
            System.out.println("Redoing action: " + current.action);
        } else {
            System.out.println("No more actions to redo.");
        }
    }
}

