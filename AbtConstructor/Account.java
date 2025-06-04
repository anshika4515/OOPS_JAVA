class Account{
    private int id;
    private String name;

    //Default constructor 
    // public Account(){
    //     System.out.print("Account made successfully");
    // }

    //Parameterized constructor
    public Account(int i , String n){
        id = i;
        name = n;
        System.out.println("Account made successfully");
    }
    public void showAccount(){
        System.out.println("Account ID: " + id);
        System.out.println("Account Name: " + name);
    }
}

//constructor are best way to inittialize the objects.