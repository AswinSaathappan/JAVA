import java.util.Scanner;

public class c5q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
        {
            System.out.print("Element "+ i + ": ");
            arr[i] = input.nextInt();
        }
        int mid = (0+size)/2; 
        if (size % 2 == 0) {
            System.out.println("Middle elements of the array are arr[" + (mid - 1) + "] = " + arr[mid - 1] + " and arr[" + mid + "] = " + arr[mid]);
        } else {
            System.out.println("Middle element of the array is arr[" + mid + "] = " + arr[mid]);
        }
        input.close();
    }
    
}
