import java.util.Scanner;

public class c1q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = input.nextInt();
        System.out.print("Enter b:");
        int b = input.nextInt();
        System.out.print("Enter c:");
        int c = input.nextInt();
        int d = a*b*c;
        System.out.println("Value of d: "+d);
        int e = a + b + c;
        System.out.println("Value of e: "+e);
        System.out.printf("d/e: %f", (float)d / e);
        input.close();
    }
}
