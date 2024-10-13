package FromScratch;
class Node {
    String action;
    Node prev;
    Node next;

    public Node(String action) {
        this.action = action;
        this.prev = null;
        this.next = null;
    }
}
