import linkedlist.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addNodeFromTail(1);
        singlyLinkedList.addNodeFromTail(2);
        singlyLinkedList.addNodeFromTail(3);
        singlyLinkedList.addNodeFromTail(4);
        singlyLinkedList.addNodeFromTail(5);
        singlyLinkedList.addNodeFromTail(6);

        singlyLinkedList.addNodeFromHead(7);
        singlyLinkedList.removeNodeFromHead();

        singlyLinkedList.removeNodeFromTail();

        singlyLinkedList.addNodeAtIndex(2, 10);
        singlyLinkedList.removeNodeAtIndex(2);

        singlyLinkedList.setNodeValueFromTail(9);
        singlyLinkedList.setNodeValueFromHead(10);
        singlyLinkedList.setValueAtIndex(2, 12);

        singlyLinkedList.display();
        singlyLinkedList.findValueAtIndex(2);

        singlyLinkedList.countAllNode();
    }
}
