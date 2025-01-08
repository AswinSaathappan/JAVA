import java.util.Scanner;

public class c5q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int sum=0;
        for(int i=0; i<5; i++)
        {
            System.out.print("NUM "+ (i+1) + ":");
            arr[i]=input.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Total: "+sum);
        input.close();
    }
    
}
