import java.util.Scanner;

public class c2q3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        if(num%2==0)
        {
            System.out.printf("%d is even",num);
        }
        else
        {
            System.out.printf("%d is odd",num);
        }
        input.close();
    }
}
