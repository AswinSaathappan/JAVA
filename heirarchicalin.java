class Animal
{
    void display()
    {
        System.out.println("I'm a animal");
    }
}

class Dog extends Animal{
    void display()
    {
        System.out.println("I'm a dog");
        super.display();
    }
}

class Cat extends Animal{
    void display()
    {
        System.out.println("I'm a cat");
        super.display();
    }
}

class Cow extends Animal{
    void display()
    {
        System.out.println("I'm a cow");
        super.display();
    }
}
public class heirarchicalin {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.display();

    Cat c = new Cat();
    c.display();

    Cow C = new Cow();
    C.display();
  }   
}
