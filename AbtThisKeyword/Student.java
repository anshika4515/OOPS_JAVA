class Student{

  
    private int roll;
    private String name;

    public Student(int roll, String name){
        this.roll = roll;  //we have to take same name as a industry practise
        this.name=name;   //used this here 
    }
    public void showStudent(){
        System.out.println(roll + " " + name);
    }
}


//ecery method have this in its argument.

// 1. By using this we can resolve the overlapping of instance variable of a class done by the local variables of a method
// with the same name. 


//2. By using this we can perform CONSTRUCTOR chaining