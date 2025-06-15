class myMath{
   public void add(int a , int b){  //parameters //formal arguments
    System.out.println(a+b);
   }
}

public class ArgPassDemo{
   public static void main(String[] args) {
      myMath obj = new myMath();
      obj.add(1,2);   //arguments  //Actual Arguments
   }
}