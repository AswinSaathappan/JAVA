import java.util.Scanner;

public class c5q2 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        for(int i=0; i<=10 ;i++)
        {
            System.out.printf("%d x %d = %d\n",num,i,num*i);
        }
        input.close();
      }    
}
