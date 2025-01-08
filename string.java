/*Strings in Java are stored on the heap, and the variable only stores a reference to where the real string value can be
 found.If you use == to compare strings, you might get unexpected results.*/
public class string{
    public static void main(String[] args) {
    String f1 = "apple";
    String f2 = "apple";

    String a1 = new String("orange");
    String a2 = new String("orange");
    
    System.err.println(f1==f2);//true since the reference(address)will be same
    System.out.println(a1==a2);//false since the reference(address)will be different

    System.out.println(f1.equals(f2));
    System.out.println(a1.equals(a2));
} 
}