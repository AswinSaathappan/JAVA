public class func1 {

    void greeting() {
        System.out.println("Hello");
        name();
    }

    static void name(){
        System.out.println("I'm Aswin");
    }

    public static void main(String[] args) {
        func1 obj1 = new func1();
        obj1.greeting();
        //greeting();  non-static method greeting() cannot be referenced from a static context greeting();
        name();//But if I declare as static i can access it without an object.
}
}

