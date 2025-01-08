import java.util.Scanner;

public class c3q3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any of the traffic light colour:");
    String color = input.nextLine();
    if(color.equalsIgnoreCase("red"))
    {
        System.out.println("Stop");
    }
   else if(color.equalsIgnoreCase("yellow"))
   {
    System.out.println("Get ready");
   }
   else if(color.equalsIgnoreCase("green"))
   {
    System.out.println("Go");
   }
   else
   {}
   input.close();
    }
}