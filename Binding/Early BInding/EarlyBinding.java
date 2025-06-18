class Parent{
    public static void show(){
        System.out.println("I am Parent");
    }
}

class Child extends Parent{
    public static void show(){
        System.out.println("I am Child");
    }
}
public class EarlyBinding{
    public static void main(String[] args) {
         Parent p = new Child();   //it will always call the function for the refrence which we are defining
         p.show();   //This is called Early Binding
    }
}