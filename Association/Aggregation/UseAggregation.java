class MusicPlayer{   //contained class
    private String name;

    public MusicPlayer(String name){
        this.name=name;
    }
    
    public void startMusic(){
        System.out.println("Music is started");
    }

    public void stopMusic(){
        System.out.println("Music is stopped");
    }
}

class Car{    //container class
    private String name;
    private MusicPlayer player;

    public Car(String name , MusicPlayer player){
        this.name=name;
        this.player=player;
    }
    public void startPlayer(){
        player.startMusic();
    }
    public void stopPlayer (){
        player.stopMusic();
    }
}
public class UseAggregation{
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer("Sony");
        Car breeza = new Car("Breeza",player);
        breeza.startPlayer();
        breeza.stopPlayer();
    }
}


//Using Aggregation in here -> Music class can be called without Car also. Both are independent of each other