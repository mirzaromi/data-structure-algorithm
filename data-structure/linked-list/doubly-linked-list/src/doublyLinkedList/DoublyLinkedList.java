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

    public void removeNodeFromTail() {
        Node current = head;
        if (head == null) {
            System.out.println("no data found");
        } else if (head == tail) {
            head = tail = null;
        } else {
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            current.setNext(null);
            tail = current;
        }
    }

    public void removeNodeFromHead() {
        Node current = head;
        if (head == null) {
            System.out.println("no data found");
        } else if (head == tail) {
            head = tail = null;
        } else {
            current = current.getNext();
            current.setPrev(null);
            head = current;
        }
    }

    public void removeNodeAtIndex(Integer index) {
        Integer size = size();
        Integer maxIndex = size-1;

        if (index > maxIndex || index < 0) {
            System.out.println("the minimum index is " + 0 + " and the maximum index is " + maxIndex);
        } else {
            Node current = head;
            if (index == 0) {
                removeNodeFromHead();
            } else if (index == maxIndex) {
                removeNodeFromTail();
            } else {
                Integer counter = 0;
                while (counter < index-1 && current != null) {
                    current = current.getNext();
                    counter++;
                }
                Node nextAfterRemovedNode = current.getNext().getNext();
                current.setNext(nextAfterRemovedNode);
                nextAfterRemovedNode.setPrev(current);
            }
        }
    }

    public <T> void setNodeFromHead(T data) {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty");
        } else {
            Node newNode = new Node(data);
            newNode.setNext(head.getNext());
            head.getNext().setPrev(newNode);
            head = newNode;
        }
    }

    public <T> void setNodeFromTail(T data) {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty");
        } else {
            Node newNode = new Node(data);
            newNode.setPrev(tail.getPrev());
            tail.getPrev().setNext(newNode);
            tail = newNode;
        }
    }

    public <T> void setNodeAtIndex(Integer index, T data) {
        Integer size = size();
        Integer maxIndex = size-1;

        if (index > maxIndex || index < 0) {
            System.out.println("the minimum index is " + 0 + " and the maximum index is " + maxIndex);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            if (index == 0) {
                setNodeFromHead(data);
            } else if (index == maxIndex) {
                setNodeFromTail(data);
            } else {
                Integer counter = 0;
                while (counter < index-1 && current != null) {
                    current = current.getNext();
                    counter++;
                }
                Node nextAfterSetNode = current.getNext().getNext();

                newNode.setNext(current.getNext().getNext());
                newNode.setPrev(current);
                nextAfterSetNode.setPrev(newNode);
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

    public void findHeadValue() {
        showValue(0, head.getData());
    }

    public void findTailValue() {
        showValue(size()-1, tail.getData());
    }

    public void findValueAtIndex(Integer index) {
        if (head == null) {
            System.out.println("list is empty");
        }

        Integer countAllNodes = size();
        Integer maxIndex = countAllNodes-1;
        if (index >= countAllNodes || index < 0) {
            System.out.println("the minimum index is " + 0 + " and the maximum index is " + maxIndex);
        } else {
            if (index == 0) {
                showValue(index, head.getData());
            } else if (index == maxIndex) {
                showValue(index, tail.getData());
            } else {
                Node currentNode = head;
                int counter = 0;
                while (currentNode != null && counter<index) {
                    currentNode = currentNode.getNext();
                    counter++;
                }
                showValue(index, currentNode.getData());
            }
        }
    }

    private  <T> void showValue(Integer index, T data) {
        System.out.println("the value at index : " + index +  " is " + data);
    }
}
