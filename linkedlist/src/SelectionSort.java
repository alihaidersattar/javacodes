public class SelectionSort {
    int []array={6,8,4,2,3,9,1};



    public void selectionSort(){
        for(int i=0; i<array.length-1; i++){
            int minindex=i;

            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[minindex]){
                    minindex=j;
                }
            }
            if(minindex!=i){
                int temp=array[minindex];
                array[minindex]=array[i];
                array[i]=temp;

            }

        }
    }

    public void printArray(){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args){
        SelectionSort list1=new SelectionSort();
        list1.printArray();
        list1.selectionSort();
        System.out.println("Sorted array: ");
        list1.printArray();
    }

}
