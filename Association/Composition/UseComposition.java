class College{

    private String collName;
    private int estYear;
    private final Department dept;


    public College(String collName , int estYear , String DeptName , String HodName){
        this.collName =collName;
        this.estYear=estYear;
        dept = new Department(DeptName,HodName);
    }

    private final class Department{
         private String DeptName;
         private String HodName;

         public Department(String DeptName , String HodName){
            this.DeptName=DeptName;
            this.HodName=HodName;
         }

         public String toString(){
            return "Department Name:" + this.DeptName + "Hod Name" + this.HodName;
         }

    }

    public void showCollege(){
        System.out.println("College Name:"+collName+" "+ "Estimated Year:"+estYear);
        System.out.println("Department Details:" + dept.toString());
    }
}
public class UseComposition{
    public static void main(String[] args) {
        College c = new College("Chitkara University",2003,"CSE","Anshika Verma");
        c.showCollege(); 
    }
}

//Example for Composition Relation Department class is totally dependent on Department class