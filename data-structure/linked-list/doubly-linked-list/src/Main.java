import doublyLinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.addNodeFromTail(1);
        linkedList.addNodeFromTail(2);
        linkedList.addNodeFromTail(3);
        linkedList.addNodeFromTail(4);
        linkedList.addNodeFromTail(5);
        linkedList.addNodeFromTail(6);
        linkedList.addNodeFromTail(7);

        linkedList.addNodeFromHead(0);
        linkedList.addNodeFromTail(8);
        linkedList.addNodeAtIndex(2, 8);

        linkedList.removeNodeAtIndex(2);
        linkedList.removeNodeFromTail();
        linkedList.removeNodeFromHead();


        linkedList.setNodeFromHead(12);
        linkedList.setNodeFromTail(13);
        linkedList.setNodeAtIndex(2, 10);

        linkedList.display();
        System.out.println();
        System.out.println(linkedList.size());
        System.out.println();
        linkedList.displayFromTail();

        linkedList.findHeadValue();
        linkedList.findTailValue();
        linkedList.findValueAtIndex(2);

    }
}