
class Shape {

    public void area(int a) {
        System.out.println(a * a);
    }

    public void area(double a) {
        System.out.println(a * a);
    }

    public void area(int a, int b) {
        System.out.println(a * b);
    }
}

public class UseShape {

    public static void main(String[] args) {
        Shape obj = new Shape();
        obj.area(10);
        obj.area(1.2);
        obj.area(1, 2);
    }

}


// This is example for CompileTimePolymorphism