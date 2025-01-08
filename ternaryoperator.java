import java.util.Scanner;

public class ternaryoperator {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int a = input.nextInt();
    int b = input.nextInt();
    int max = a>b ? a : b;
    System.out.println("MAXIMUM:"+max);
    input.close();
   } 
}
