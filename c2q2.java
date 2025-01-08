import java.util.Scanner;

public class c2q2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = input.nextInt();
        if((n%3==0) && (n%5==0))
        {
            System.out.printf("%d is divisible by both 3 and 5",n);
        }
        else
        {
            System.out.printf("%d is not divisble by both 3 and 5",n);
        }
        input.close();
    }
}
