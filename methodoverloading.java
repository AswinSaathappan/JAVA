import java.util.Scanner;

public class methodoverloading {
    int add (Scanner input)
    {
        System.out.print("Enter a:");
        int a = input.nextInt();
        System.out.print("Enter b:");
        int b = input.nextInt();
        return a+b;       
    }
    
    int add (Scanner input,int a,int b)
    {
        System.out.print("Enter a:");
        int c = input.nextInt();
        System.out.print("Enter b:");
        int d = input.nextInt();
        return c+d;       
    }

    float add (Scanner input,float a,float b)
    {
        System.out.print("Enter a:");
        float e = input.nextFloat();
        System.out.print("Enter b:");
        float f = input.nextFloat();
        return e+f;       
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        methodoverloading obj1 = new methodoverloading();
        System.out.println(obj1.add(input));
        System.out.println(obj1.add(input, 0, 0));
        System.out.println(obj1.add(input, 0f, 0f));
        input.close();
    }
}
