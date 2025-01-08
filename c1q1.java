import java.util.Scanner;

public class c1q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = input.nextLine();
        System.out.print("Entter age:");
        int age = input.nextInt();
        System.out.println();
        System.out.println("My name is "+name);
        System.out.printf("I'm %d years old",age);
        input.close();
    }
}
