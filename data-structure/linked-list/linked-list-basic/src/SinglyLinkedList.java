public class SinglyLinkedList {
    public Node head = null;
    public Node tail = null;

    /**
     * Add a new data from the tail
     *
     **/
    public <T> void addNodeFromTail(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    /**
     * Add a new data from the head
     *
     **/
    public <T> void addNodeFromHead(T data) {
        Node<T> currentNode = head;
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = currentNode;
            head = newNode;
        }
    }

    /**
     * Remove a data from the tail
     *
     **/
    public void removeNode() {
        if (head == null) {
            System.out.println("no data found");
        } else if (head==tail){
            head = null;
            tail = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
    }

    /**
     * Remove a data from the tail
     *
     **/
    public void removeNodeFromHead() {
        Node current = head;
        if (head == null) {
            System.out.println("no data found");
        } else if (head==tail){
            head = null;
            tail = null;
        } else {
            head = current.next;
        }
    }

    public void displayLast() {
        Node current = head;
        if (head == null) {
            System.out.println("list is empty");
        }

        while (current != null && current.next != null) {
            current = current.next;
        }
//        assert current != null;
        System.out.println(current.data);
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


