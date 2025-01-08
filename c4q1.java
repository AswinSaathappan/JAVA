import java.util.Scanner;

public class c4q1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = input.nextInt();
        System.out.print("Enter b:");
        int b = input.nextInt();
        for(int i=a; i<=b ; i++)
        {
            System.out.println(i);
        }
        input.close();
    }
}
