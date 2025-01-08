public class constructor {
    String name;
        constructor()
        {
            name = "Aswin";
            System.out.println("Hello");
        }
    public static void main(String[] args)
    {
        constructor obj1 = new constructor();
        constructor obj2 = new constructor();
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
