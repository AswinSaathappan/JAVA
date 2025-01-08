import java.util.Scanner;

public class c3q1{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter score:");
        int score = input.nextInt();
        if(score<50)
        {
            System.out.println("You need to improve");
        }
        else if(score>=50 && score<=70)
        {
            System.out.println("Good job");
        }
        else
        {
            System.out.println("Excellent performance!");
        }
        input.close();
    }
}