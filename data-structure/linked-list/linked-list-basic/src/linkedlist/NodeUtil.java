package linkedlist;

public class NodeUtil {
    public static <T> void showValue(Integer index, T value) {
        System.out.println("the value at index : " + index +  " is " + value);
    }

    /**
     * Count all nodes in the linked list
     *
     **/
    public static Integer countNode(Node node) {
        Integer counter = 0;
        Node current = node;
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
    public static void countAllNode(Node node) {
        System.out.println("total node is " + countNode(node));
    }
}
