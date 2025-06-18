class Engine{
   public void start(){
    System.out.println("Start");
   }
}

class MusicPlayer{
    public void musicPlayer(){
        System.out.println("Start Music");
    }
}

class Car{   
    Engine e = new Engine();
    MusicPlayer m = new MusicPlayer();  //cant call method directly
    
    public void startEngine(){
        e.start();
    }

    public void startMusic(){
        m.musicPlayer();
    }

}

public class UseAssociation{
    public static void main(String[] args) {
        Car obj = new Car();
        obj.startEngine();
        obj.startMusic();
    }
}

//Example of Association  -> as i am calling Car class in my Main class i.e. UseAssociation which already contains two initiated objects. 