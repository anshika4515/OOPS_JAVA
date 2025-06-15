public class UseAddition{
    public static void main(String[] args) {
        Addition a = new Addition();
        //Method Overloading Happening Here
        //1. On basis of chnge in datatypes of parameter
        System.out.println(a.add(1, 2));
        System.out.println(a.add(1.2, 2.5));
        System.out.println(a.add("anshika", "verma"));
        //2. On basis of number of parameter
        System.out.println(a.add(1, 2, 3));
        //3. On basis of order of parameters
        a.show(1, "Anshika");
        a.show("Anshika", 2);
    }
}