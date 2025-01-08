import java.util.Scanner;

public class c6q1 {
    void evenorodd(int num)
    {
        if(num%2==0)
        {
            System.out.println(num+" is even");
        }
        else{
            System.out.println(num+ " is odd");
        }
    }
    public static void main(String[] args)
    {
        c6q1 obj1 = new c6q1();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        obj1.evenorodd(num);
        input.close();
    }
}
