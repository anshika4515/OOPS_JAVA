public class ArgPassDemo2{
   public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println(a+" "+b);
    add(a, b);
    System.out.println(a+" "+b);
   }    
   //this shows that java process pass by value
   //both value come will be same
   static int add(int a , int b){
       return  a+b;
   }
}