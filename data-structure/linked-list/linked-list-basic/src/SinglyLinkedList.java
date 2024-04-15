public class SinglyLinkedList {
    public Node head = null;
    public Node tail = null;

    public <T> void addNode(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("list is empty");
        }

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }

}


