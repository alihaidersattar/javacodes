public class Stackarray{
   static class stack {
        int[] array =new int[10];
        int top=-1;
        public void push(int data){
            if(top< array.length){
                top=top+1;
                array[top]=data;
            }
            else {
                System.out.println("Stack is already full.");
            }
        }
        public void pop(){
            if(top==0){
                System.out.println("No element in stack to be popped.");
            }
            else{
                System.out.println("Element popped: "+array[top]);
                top=top-1;
            }
        }
        public void printStack(){
            for(int i=top; i>=0; i--){
                System.out.println(array[i]);
            }
        }
      public static void main(String[] args){
            stack mystack= new stack();
            mystack.push(5);
            mystack.push(6);
            mystack.push(7);
            mystack.push(8);
            mystack.push(9);
            mystack.push(10);
            mystack.push(11);
            mystack.push(12);
            mystack.push(13);
            mystack.push(13);
            mystack.pop();
            mystack.pop();
            mystack.pop();

            mystack.printStack();

        }
    }

}
