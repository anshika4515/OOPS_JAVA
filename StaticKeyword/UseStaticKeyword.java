class Emp{
    private int age;
    private String name;
    private static  String comapany = "Amazon"; //will take memory one time only in the memory area
 
    public Emp(int age , String name){
        this.age = age;
        this.name = name;
    }

    public void display(){
        System.out.println(age +" "+ name +" "+ comapany);
    }
    public static void showCompany(){
        System.out.println(comapany);
    }
}
public class UseStaticKeyword{
    public static void main(String[] args) {
        Emp.showCompany(); //can access through class name bcz keyword is static and method is also static
        Emp e1 = new Emp(10,"Anshika");
        Emp e2 = new Emp(2,"Shaheen");
        e1.display();
        e2.display();
    }
}