 class Stack{
//    node for tracking top position
    Node top;
    static class Node{
//  elements in every node of stack
        int data;
        Node next;
//      for initialization of node
        Node(int d){
            data=d;
            next=null;
        }
    }
//    Method to pop element from start of a list
     public void pop() {
         if (top == null) {
             System.out.println("No node to delete.");
         } else {
             top = top.next; // Set the next element as the new top
         }
     }
//     Method to push(insert) element at start of a list
     public  void push(int data){
        if (top==null){
            top=new Node(data);
        }
        Node newnode=new Node(data);
        newnode.next=top;
        top=newnode;

    }
//    Method to print data in a list
    public void printData(){
        Node temp=top;
        if(temp==null){
            System.out.println("No node to delete.");
        }
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args){
//      initializing stack element as stack1
        Stack stack1=new Stack();
//        pushing elements in stack
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
//        printing elements before popping
        System.out.println("Stack before popping any element:");
        stack1.printData();
//        popping one element from stack
        stack1.pop();
//         printing elements after popping
        System.out.println("Stack after popping one element:");
        stack1.printData();
    }
}
