class Animal
{
    void display()
    {
    System.out.println("I'm a animal");
    }
}

class Dog extends Animal
{
    void display()
    {
        super.display();
    System.out.println("I'm a dog");
    }
}


public class singlein {
    public static void main(String[] args) {
    Dog d = new Dog();
    d.display();
    }
}
