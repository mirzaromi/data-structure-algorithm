package linkedlist;

public class SinglyLinkedList {
    private Node head = null;
    private Node tail = null;

    /**
     * Add a new data from the tail
     *
     **/
    public <T> void addNodeFromTail(T data) {
        Node<T> newNode = new Node<>(data);

        // if head is null then set head first
        // else set in the next tail since the head and the tail have the same node
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        // track the new tail for new node
        tail = newNode;
    }

    /**
     * Add a new data from the head
     *
     **/
    public <T> void addNodeFromHead(T data) {
        Node<T> currentNode = head;
        Node<T> newNode = new Node<>(data);
        // if head is null set head first
        // else set the current head to the newNode and set the head to the newNode
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = currentNode;
            head = newNode;
        }
    }

    /**
     * Add a new data at index with index start from zero
     * @Param   index start from zero
     * @Param   data all types of data for the linked list
     **/
    public <T> void addNodeAtIndex(Integer index, T data) {
        Integer countAllNodes = countNode();
        Integer maxIndex = countAllNodes-1;
        // validate the index is valid or not
        if (index >= countAllNodes || index < 0) {
            System.out.println("the minimum index is " + 0 + " and the maximum index is " + maxIndex);
        } else {
            Node<T> currentNode = head;
            Node<T> newNode = new Node<>(data);

            if (index == 0) {
                addNodeFromHead(data);
            } else if (index == maxIndex) {
                addNodeFromTail(data);
            } else {
                int counter = 0;
                while (currentNode != null && counter<index-1) {
                    currentNode = currentNode.next;
                    counter++;
                }
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
        }
    }

    /**
     * Remove a data from the tail
     *
     **/
    public void removeNodeFromTail() {
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
     * Remove a data from the head
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

    /**
     * Remove a new data at index with index start from zero
     * @Param   index start from zero
     * @Param   data all types of data for the linked list
     **/
    public <T> void removeNodeAtIndex(Integer index) {
        Integer countAllNodes = countNode();
        Integer maxIndex = countAllNodes-1;
        if (index >= countAllNodes || index < 0) {
            System.out.println("the minimum index is " + 0 + " and the maximum index is " + maxIndex);
        } else {
            Node<T> currentNode = head;

            if (index == 0) {
                removeNodeFromHead();
            } else if (index == maxIndex) {
                removeNodeFromTail();
            } else {
                int counter = 0;
                while (currentNode != null && counter<index-1) {
                    currentNode = currentNode.next;
                    counter++;
                }
                currentNode.next = currentNode.next.next;
            }
        }
    }

    /**
     * Display all linked list value
     *
     **/
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

    /**
     * Find node at index
     * @Param   index start from zero
     **/
    public void findValueAtIndex(Integer index) {
        if (head == null) {
            System.out.println("list is empty");
        }

        Integer countAllNodes = countNode();
        Integer maxIndex = countAllNodes-1;
        if (index >= countAllNodes || index < 0) {
            System.out.println("the minimum index is " + 0 + " and the maximum index is " + maxIndex);
        } else {
            if (index == 0) {
                showValue(index, head.data);
            } else if (index == maxIndex) {
                showValue(index, tail.data);
            } else {
                Node currentNode = head;
                int counter = 0;
                while (currentNode != null && counter<index) {
                    currentNode = currentNode.next;
                    counter++;
                }
                showValue(index, currentNode.data);
            }
        }
    }

    /**
     * Set data from the tail
     *
     **/
    public <T> void setNodeValueFromTail(T data) {
        if (head == null) {
            System.out.println("no data found");
        } else {
            tail.data = data;
        }
    }

    /**
     * Remove a data from the head
     *
     **/
    public <T> void setNodeValueFromHead(T data) {
        Node current = head;
        if (head == null) {
            System.out.println("no data found");
        } else {
            head.data = data;
        }
    }

    /**
     * Set node value at index
     * @Param   index start from zero
     **/
    public <T> void setValueAtIndex(Integer index, T data) {
        if (head == null) {
            System.out.println("list is empty");
        }
        Integer countAllNodes = countNode();
        Integer maxIndex = countAllNodes-1;
        if (index >= countAllNodes || index < 0) {
            System.out.println("the minimum index is " + 0 + " and the maximum index is " + maxIndex);
        } else {
            if (index == 0) {
                setNodeValueFromHead(data);
            } else if (index == maxIndex) {
                setNodeValueFromTail(data);
            } else {
                Node currentNode = head;
                int counter = 0;
                while (currentNode != null && counter<index) {
                    currentNode = currentNode.next;
                    counter++;
                }
                currentNode.data = data;
            }
        }
    }

    private  <T> void showValue(Integer index, T value) {
        System.out.println("the value at index : " + index +  " is " + value);
    }

    /**
     * Count all nodes in the linked list
     *
     **/
    private Integer countNode() {
        Integer counter = 0;
        Node current = head;
        while (current != null) {
            counter++;
            current = current.next;
        }

        return counter;
    }

    /**
     * Show the count nodes in the linked list
     *
     **/
    public void countAllNode() {
        System.out.println("total node is " + countNode());
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void setHeadAndTail(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }
}


