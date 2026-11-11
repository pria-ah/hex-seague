class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;

    void addAtBeginning(int data) {
        Node ptr = new Node(data);
        if (head == null) {
            head = ptr;
        } else {
            ptr.next = head;
            head = ptr;
        }
    }

    void addAtMiddle(int data, int pos) {
        Node ptr = new Node(data);
        int l = 1;
        Node temp = head;

        while (temp != null && temp.next != null) {
            if (l == pos) {
                ptr.next = temp.next;
                temp.next = ptr;
                break;
            }
            temp = temp.next;
            l++;
        }
    }

    void addAtLast(int data) {
        Node ptr = new Node(data);
        if (head == null) {
            head = ptr;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ptr;
        }
    }

    void deleteAtBeginning() {
        if (head == null) return;
        head = head.next;
    }

    void deleteAtLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        Node save = null;

        while (temp.next != null) {
            save = temp;
            temp = temp.next;
        }

        save.next = null;
    }

    void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("empty");
            return;
        }

        if (pos == 1) {
            head = head.next;
            return;
        }

        int l = 1;
        Node temp = head;
        Node save = null;

        while (temp != null) {
            if (l == pos) {
                save.next = temp.next;
                return;
            }
            save = temp;
            temp = temp.next;
            l++;
        }
    }

    void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);

        System.out.print("Original list:           ");
        list.show();

        list.deleteAtBeginning();

        System.out.print("After deleteAtBeginning: ");
        list.show();
    }
}