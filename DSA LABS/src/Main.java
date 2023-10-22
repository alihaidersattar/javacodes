import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String phrase="hello";
        System.out.println("Enter your name: ");
        String name= input.nextLine();
        System.out.println(phrase +" " + name + " enter your age :");
        int age= input.nextInt();
        System.out.println(name + " you are " +age +"years old.");





    }
}