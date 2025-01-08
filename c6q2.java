import java.util.Scanner;

public class c6q2 {
    String passorfail(int mark)
    {
       if(mark>=35)
       {
        return "pass";
       }
       else{
        return "fail";
       }
    }
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter marks:");
      int mark = input.nextInt();
      c6q2 obj1 = new c6q2();
      String result = obj1.passorfail(mark);
      System.out.println("RESULT: "+result);
      input.close();
    }
    
}
