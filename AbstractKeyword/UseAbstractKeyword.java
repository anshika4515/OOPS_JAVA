abstract class Parent{
    abstract public void M1();
    abstract public void M2();
    public void M3(){
        System.out.println("M3 printed");
    }
}

public class UseAbstractKeyword extends Parent{
 public static void main(String[] args) {
      UseAbstractKeyword obj = new UseAbstractKeyword();
      obj.M1();
      obj.M2();
      obj.M3();
 }

 @Override
 public void M1(){
     System.out.println("M1");
 }   

 @Override
 public void M2(){
     System.out.println("M2");
 }
}

//override using abstract keyword