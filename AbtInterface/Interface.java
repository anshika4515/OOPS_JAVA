interface Animal {  //make interface 
    void makeSound();   //by deafualt take public abstract
    void eat();
}

class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Make Sound bark");
    }

    @Override
    public void eat(){
        System.out.println("Eat Bread");
    }
}

class Elephant implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Make trumph sound");
    }
    @Override
    public  void eat(){
        System.out.println("Eat leaves");
    }

}

public class Interface{
    public static void main(String[] args) {
        Animal obj;
        obj = new Dog();
        obj.makeSound();
        obj.eat();


        obj = new Elephant();
        obj.makeSound();
        obj.eat();
    }
}


//Shows interface and shows how it is showing run time polymorphism