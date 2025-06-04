public class Student{
    private int id;
    private String name;
    private double percentage;

    public void setStudent(int i, String n , double p){
        id = i;
        name = n;
        percentage = p;
    }
    public void showStudent(){
        System.out.println("id: "+ id);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage);
    }
}