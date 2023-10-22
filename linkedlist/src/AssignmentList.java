
public class AssignmentList {
    Node head;
//    defining node
    static class Node {
        int data;
        Node next;
//        initializing node
        Node(int d) {
            data = d;
            next=null;
        }
    }
//    Method for insertion at end to populate both lists for test
    public void insertionAtEnd(int data){
//        In case  if list id empty
        if(head==null){
            head =new Node(data);
        }
//        If list contains any element already
        else {
            Node temp=new Node(data);
            Node pointer=head;
            while(pointer.next!=null){
                pointer=pointer.next;
            }
//            updating reference accordingly
            pointer.next=temp;
            temp.next=null;
        }
    }
//    Method to print lists in order to verify results at end.
    public void printList(){
        Node pointer=head;
        while(pointer!=null){
            System.out.print(pointer.data+" ");
            pointer=pointer.next;
        }
    }
//   Method to count elements in a list used in comparison function.
    public int countElements(){
        Node pointer=head;
        int count=0;
        while(pointer!=null){
            count=count+1;
            pointer=pointer.next;
        }
        return count;
    }
//    Method to compare lists if they are equal or not
    public void compareLists(AssignmentList list1, AssignmentList list2){
        Node pointer1=list1.head;
        Node pointer2=list2.head;
//     Temporary variable to store result in form of 0 or 1.
        int temp=0;
//     Checking if numbers of elements in both lists are equal to extend further processing.
        if(list1.countElements()==list2.countElements()) {
            while (pointer1.next != null && pointer2.next != null) {
//              Checking data one by one in both lists.
                if (pointer1.data == pointer2.data) {
                    temp = 1;
                } else {
                    temp = 0;
                    break;
                }
                pointer1 = pointer1.next;
                pointer2 = pointer2.next;

            }
//            Check for last element
            if (pointer1.data == pointer2.data) {
                temp = 1;
            } else {
                temp = 0;
            }
        }
//        Finalizing results on the basis of temp variable.
        if(temp==1){
            System.out.println("Result: Given two lists are equal.");
        } else {
            System.out.println("Result: Given two lists are not equal.");
        }
    }
    public static void main(String[] args){
//          Making a list named as first list
        AssignmentList firstList=new AssignmentList();
//          Making another  list named as second list
        AssignmentList secondList=new AssignmentList();
//        populating some elements in first list
        firstList.insertionAtEnd(3);
        firstList.insertionAtEnd(4);
        firstList.insertionAtEnd(5);
        firstList.insertionAtEnd(6);
//        populating secondList with some random elements.
        secondList.insertionAtEnd(3);
        secondList.insertionAtEnd(4);
        secondList.insertionAtEnd(5);
        secondList.insertionAtEnd(6);
//      Calling compareList function to check results
        firstList.compareLists(firstList,secondList);
//        printing both lists in order to verify the above result.
        System.out.print("First list: ");
        firstList.printList();
        System.out.println();
        System.out.print("Second list: ");
        secondList.printList();

    }


}
