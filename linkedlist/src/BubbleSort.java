public class BubbleSort {
    int[] array = {8, 9, 6, 4,0,1,3,4,2};

    public void bubbleSort() {
        int n=array.length;
        boolean swapped;
        do{
            swapped=false;
            for(int i=1; i<n; i++){
                if(array[i-1]>array[i]){
                    int temp=array[i-1];
                    array[i-1]=array[i];
                    array[i]=temp;
                    swapped=true;
                }
            }
            n--;
        }while (swapped);

     }
    public void printArray() {
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }







    public static void main(String[] args) {
        BubbleSort list=new BubbleSort();
        list.printArray();
        list.bubbleSort();
        list.printArray();

    }
}











