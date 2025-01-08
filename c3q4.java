import java.util.Scanner;

public class c3q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary:");
        int salary = input.nextInt();
        System.out.print("Enter age:");
        int age = input.nextInt();
        if((salary>=20000) || (age<=25))
        {
            System.out.print("Enter loan amount:");
            int loan = input.nextInt();
            {
                if(loan<=50000)
                {
                        System.out.println("You are eligible for loan");
                }
                else{
                    System.out.println("Maximum loan amount is 50000");
                }
            }
        }
        else{
            System.out.println("You are not eligible for loan");
        }
        input.close();
    }
}
