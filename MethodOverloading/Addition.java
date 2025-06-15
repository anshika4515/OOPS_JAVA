public class Addition{
    public int add(int a , int b){
        return a+b;
    }
    
    public int add(int a , int b , int c){
        return a+b+c;
    }

    public double add(double a , double  b){
        return  a+b;
    }

    public String add(String s1 , String s2){
        return s1+s2;
    }

    public void show(String a , int b){
        System.out.println(a);
        System.out.println(b);
    }

     public void show(int b , String a){
        System.out.println(b);
        System.out.println(a);
    }
}