class Language{
    public void greet(){

    }
}
class Hindi extends Language{
    public void greet(){
        System.out.println("Namaste");
    }
}

class English extends  Language{
    public void greet(){
        System.out.println("Good Morning");
    }
}

class French extends Language{
    public void greet(){
        System.out.println("Bon jor");
    }
}

public class UseGreeting{
    public static void main(String[] args) {
    // ->  The below code is voilating the run time polymorphism
        // Hindi h = new Hindi();     
        // h.greet();
        // English e = new English();
        // e.greet();
        // French f = new French();
        // f.greet();
 
        Language lng;     //This is how run tim polymorphism is achieved we make refrence of the parent class and then call it with the child classes
        lng = new Hindi();
        lng.greet();

        lng = new English();
        lng.greet();

        lng = new French();
        lng.greet();   

    }
}

// Unless do one thing that make a parent class make it refrence and call it with child objects.