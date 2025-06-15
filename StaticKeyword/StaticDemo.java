class Demo{
    int a;
    static int b; 
    //memory area mai jayega static //ek hi bar assign hoga //shouldnt use static keyword when using object static keywords are for class based
}
public class StaticDemo{
    public static void main(String[] args){
       Demo obj = new Demo();
       Demo obj2 = new Demo();
       Demo obj3 = new Demo();
       obj.a = 10;
       obj2.a = 20;
       obj3.a = 30;
       obj.b =10;
       obj.b=20;
       obj.b=30;
       System.out.println(obj.a+" "+obj2.a+" "+obj3.a);
       System.out.println(obj.b+" "+obj2.b+" "+obj3.b);  //used by java automatically Demo.b etc.
       
    }
}