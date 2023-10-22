
import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = myObj.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at index " + i +":");
            array[i] = myObj.nextInt();
        }
        System.out.println("Enter number to find (key) :");
        int temp=0;
        int index=0;
        int key= myObj.nextInt();
        for (int i = 0; i < n; i++) {
            if(array[i]==key){
                temp=1;
                index=i;
            }

        }
        if(temp==1){
            System.out.println("Element found at index :" + index );
        }
        else if(temp==0){
            System.out.println("Element not found." );
        }

    }
}
