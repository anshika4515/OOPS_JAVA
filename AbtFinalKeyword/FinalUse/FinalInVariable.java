class Circle{
    private int radius;
    private final double pii = 3.14;  //make it constant


    public Circle(int radius){
        this.radius=radius;
    }

    public void show(){
        System.out.println("radius"+radius);
      System.out.println("pii"+pii);
    }
}

public class FinalInVariable{
    public static void main(String[] args) {
        Circle c = new Circle(12);
        c.show();   
    }
}