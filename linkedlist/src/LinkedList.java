class LinkedList {
    Node head;
   static  class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void insertAtBeginning(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void insertAtEnd(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        return;
    }
    void deleteNode(int position) {
        if (head == null)
            return;
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
        temp.next = next;
    }
    boolean search(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key)
                return true;
            current = current.next;
        }
        return false;
    }
    void sortLinkedList(Node head) {
        Node current = head;
        Node index = null;
        int temp;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }

    }

    public void selectionSort() {
        if (head == null)
            return;
        Node current = head;
        while (current != null) {
            Node min = current;
            Node temp = current.next;
            while (temp != null) {
                if (temp.data < min.data) {
                    min = temp;
                }
                temp = temp.next;
            }
            int minValue = min.data;
            min.data = current.data;
            current.data = minValue;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insertAtEnd(1);
        llist.insertAtBeginning(2);
        llist.insertAtBeginning(3);
        llist.insertAtEnd(4);
        System.out.println("Linked list: ");
        llist.printList();
        System.out.println("\nAfter deleting an element: ");
        llist.deleteNode(0);
        llist.printList();
        System.out.println();
        llist.selectionSort();

    }
}