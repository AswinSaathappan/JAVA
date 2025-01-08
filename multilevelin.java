class Animal{
    void display()
    {
        System.out.println("I'm a animal");
    }
}

class Mammal extends Animal{
    void display()
    {
        super.display();
        System.out.println("I'm a mammal");
    }
}

class Dog extends  Mammal{
    void display()
    {
        super.display();
        System.out.println("I'm a dog");
    }
}
public class multilevelin {
     public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
     }    
}
