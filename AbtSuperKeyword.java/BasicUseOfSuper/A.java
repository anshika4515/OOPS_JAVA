class A{
    public void display(){
        System.out.println("Display....");
    }
    public void show(){
        System.out.println("Show.....");
    }
}

class B extends  A {
    public void show(){
        super.display();   //shows that methods are extended by parent class
        super.show();
    }
}