public class circularList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }
    public void deleteStart(){
        Node temp=head;

        if(temp.next==head){
            head=null;
            temp.next=null;
        }
        else {
            while (temp.next!=head){
                temp=temp.next;
            }
            temp.next=head.next;
            head=head.next;

        }
    }
    public void deleteList(int index){
        if(index==0){
            deleteStart();
        }
        Node temp=head;
        for(int i=1; i<index; i++){
            temp=temp.next;
        }

        Node previous=temp;
        Node next=temp.next;
        previous.next=next.next;
    }

    public static void main(String[] args) {
        circularList myList = new circularList();
        myList.insertAtStart(7);
        myList.insertAtStart(6);
        myList.insertAtEnd(8);
        myList.insertAtEnd(9);
        myList.insertAtEnd(10);
        myList.printList();
        myList.deleteList(2);
        myList.printList();
        myList.deleteStart();
        myList.printList();
    }
}
