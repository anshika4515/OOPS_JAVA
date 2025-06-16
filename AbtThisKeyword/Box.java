public class Box{
    private int length,breadth,height;

    public Box(int length , int breadth , int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    // public Box(int side){   //reduce the source code by using this
    //     length=side;
    //     breadth=side;
    //     height=side;
    // }
    // public Box(){
    //     length=0;
    //     height=0;
    //     breadth=0;
    // }

    public Box(int side){   //in place of above constructor we cn use this
        this(side,side,side);
    }

    public Box(){   //this is done only inside constructor
        this(0,0,0);
    }

    public void show(){
        System.out.println(length+" "+breadth+" "+height);
    }
}

//this is called constructor chaining

// -> this is a special object reference , which is also called as a keyword

//-> this is automatically created by java in a methos's argument as soon as we call the method.

//-> this stores the memory address of the current object/