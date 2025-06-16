class Bike{
    //method that is non overridable
    public final void  showSpeed(){   //helps to stop overriding within the method
        System.out.println("Speed is good");
    }
}

class Honda extends Bike{
    // public void showSpeed(){
    //     System.out.println("Speed of honda bike");
    // }
}

public class FinalInMethod{
  public static void main(String[] args) {
      Honda sb = new Honda();
      sb.showSpeed();
  }
}