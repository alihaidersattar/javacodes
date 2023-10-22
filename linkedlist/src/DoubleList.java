public class DoubleList {
    Node head;

    static class Node {
        Node previous;
        int data;
        Node next;
        Node(int d) {
            previous = null;
            data = d;
            next = null;
        }
    }

    public void insertionAtEnd(int data) {
        if (head == null) {
            Node temp = new Node(data);
            temp.next = null;
            head = temp;

        } else {
            Node pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            Node temp = new Node(data);
            pointer.next=temp;
            temp.previous = pointer;
            temp.next = null;

        }
    }
    public void insertionAtStart(int data){
    if(head==null){
        Node temp = new Node(data);
        temp.next = null;
        head = temp;
    }
    else {
        Node temp= new Node(data);
        head.previous=temp;
        temp.next=head;
        temp.previous=null;
        head=temp;
    }
    }

    public void printData() {
        Node pointer = head;
        if(pointer==null){
            System.out.println("List is empty.");
        }
        while (pointer!= null) {
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
    }
    public void deleteAtStart(){
        if(head==null){
            System.out.println("No node to delete.");
        }
        else if (head.next==null) {
            head=null;

        } else{
            Node temp=head;
            temp=temp.next;
            temp.previous=null;
            head=temp;
        }
    }
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("No node to delete.");
        } else if (head.next==null) {
            head=null;
            
        } else{
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.previous.next=null;

        }
    }
    public void deleteAtPoint(int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            deleteAtStart();
            return;
        }

        Node temp = head;
        int currentIndex = 0;

        while (temp != null && currentIndex < index) {
            temp = temp.next;
            currentIndex++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        // Update the next node's previous pointer
        if (temp.next != null) {
            temp.next.previous = temp.previous;
        }

        // Update the previous node's next pointer
        if (temp.previous != null) {
            temp.previous.next = temp.next;
        }

        // If the deleted node is the last node, update the head
        if (temp == head) {
            head = temp.next;
        }
    }


    public static void main(String[] args) {

        DoubleList list = new DoubleList();
        list.printData();
        list.insertionAtEnd(1);
        list.insertionAtEnd(2);
        list.insertionAtEnd(3);
        list.insertionAtStart(0);
        list.insertionAtStart(5);
        list.insertionAtEnd(4);
        list.printData(); // Corrected method name
        list.deleteAtStart();
        System.out.println("delete at start");
        list.printData();
        list.deleteAtStart();
        System.out.println("delete at start");
        list.printData();
        System.out.println("delete at end");
        list.printData();

    }
}
