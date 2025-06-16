class FrontendDeveloper{
    public void mySkills(){
        System.out.println("My skills are HTML , CSS ,React");
    }
}

public class FullStackDeveloper extends FrontendDeveloper {
    //overriding is been done here
     public void mySkills(){
        super.mySkills();   //this is where super keyword used to extend same method frm super class
        System.out.println("My skills are Java , SpringBoot , Problem solving");
     }
}