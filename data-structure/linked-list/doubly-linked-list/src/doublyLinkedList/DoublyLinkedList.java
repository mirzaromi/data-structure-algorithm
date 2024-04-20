package doublyLinkedList;

public class DoublyLinkedList {
    private Node head,tail;
    public <T> void addNodeFromTail(T data){
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else  {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
            tail.setNext(null);
        }
    }

    public void display() {
        Node current = head;
        checkLinkedListEmpty();
        while (current!=null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    private void checkLinkedListEmpty() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty");
        }
    }
}
