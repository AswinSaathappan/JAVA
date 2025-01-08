import java.util.Scanner;

public class c1q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = input.nextLine();
        System.out.print("Enter marks(for 100):");
        float marks = input.nextFloat();
        input.nextLine();
        System.out.print("Enter department:");
        String dname = input.nextLine();
        System.out.println("\n\nConverting your marks to out of 10:\n");
        System.out.println("NAME: "+ name);
        System.out.printf("MARKS: %.1f/10\n",marks/10);
        System.out.print("DEPARTMENT: "+dname);
        input.close();
    }
    
}
