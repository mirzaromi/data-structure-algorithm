package doublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
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

    public <T> void addNodeFromHead(T data){
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else  {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
            head.setPrev(null);
        }
    }

    public <T> void addNodeAtIndex(Integer index, T data) {
        Integer size = size();
        Integer maxIndex = size-1;

        if (index > maxIndex || index < 0) {
            System.out.println("the minimum index is " + 0 + " and the maximum index is " + maxIndex);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            if (index == 0) {
                addNodeFromHead(data);
            } else if (index == maxIndex) {
                addNodeFromTail(data);
            } else {
                Integer counter = 0;
                while (counter < index-1 && current != null) {
                    current = current.getNext();
                    counter++;
                }
                newNode.setNext(current.getNext());
                newNode.setPrev(current);
                current.setNext(newNode);
            }
        }

    }

    public Integer size() {
        Integer count = 0;
        Node current = head;

        while (current!=null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public void display() {
        Node current = head;
        checkLinkedListEmpty();
        while (current!=null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public void displayFromTail() {
        Node current = tail;
        checkLinkedListEmpty();
        while (current!=null) {
            System.out.println(current.getData());
            current = current.getPrev();
        }
    }

    private void checkLinkedListEmpty() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty");
        }
    }
}
