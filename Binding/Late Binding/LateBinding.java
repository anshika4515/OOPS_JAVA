class Parent{
    public void show(){
        System.out.println("I am Parent");
    }
}

class Child extends Parent{
    public void show(){
        System.out.println("I am Child");
    }
}
public class LateBinding{
    public static void main(String[] args) {
         Parent p = new Child();   //it will always call the function by the object defiened
         p.show();   //This is called Late Binding
    }
}