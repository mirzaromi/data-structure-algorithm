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
        singlyLinkedList.display();
        System.out.println(singlyLinkedList.countNode());
        singlyLinkedList.countAllNode();
    }
}
