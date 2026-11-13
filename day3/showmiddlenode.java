class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class showmiddlenode {

    static Node head = null;

    static void showMiddleNode() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null) {

            if (fast.next == null) {
                break;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle element is: " + slow.data);
    }

    public static void main(String[] args) {

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        showMiddleNode();
    }
}