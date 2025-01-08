import java.util.Scanner;

public class c3q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter mark1:");
        float m1 = input.nextFloat();
        System.out.print("Enter mark2:");
        float m2 = input.nextFloat();
        System.out.print("Enter mark3:");
        float m3 = input.nextFloat();
        System.out.print("Enter mark4:");
        float m4 = input.nextFloat();
        System.out.print("Enter mark5:");
        float m5 = input.nextFloat();
        if((m1+m2+m3+m4+m5/5) < 35)
        {
            System.out.println("Additional class is required");
        }
        else{
            System.out.println("You are good to go");
        }
        input .close();
    
    }
}
