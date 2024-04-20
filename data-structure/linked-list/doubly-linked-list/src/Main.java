import doublyLinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.addNodeFromTail(1);
        linkedList.addNodeFromTail(2);
        linkedList.addNodeFromTail(3);
        linkedList.addNodeFromTail(4);
        linkedList.addNodeFromTail(5);

        linkedList.addNodeFromHead(6);


        linkedList.display();
        System.out.println();
        linkedList.displayFromTail();

    }
}