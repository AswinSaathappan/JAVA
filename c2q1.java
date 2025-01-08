import java.util.Scanner;

public class c2q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks:");
        float mark = input.nextFloat();
        if(mark>=35)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
        input.close();
}
}
