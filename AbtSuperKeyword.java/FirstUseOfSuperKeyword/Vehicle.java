class Vehicle{
    public Vehicle(String type ){
        System.out.println("Vehicle is here" + type);   // if i make this constructor as parametrized
    }
}

class Car extends  Vehicle{
     // we have to manually call paent class constructor in child using super keyword 
     //now it will run fine
    public Car(){   
        super("Four Wheeler");       
        System.out.println("Calling car constructor");
    }
}