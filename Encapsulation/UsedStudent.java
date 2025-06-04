class UsedStudent{
    public static void main(String[] args){
        Student s = new Student();
        s.setStudent(1, "Anshika", 98.9);
        s.showStudent();

        Student p = new Student();
        p.setStudent(2, "Abhi", 88.7);
        p.showStudent();
    }
}

//setting the values using encapsulation such that the data members are private
// and can only be accessed through public methods.
// This is a better approach than the previous one as it provides data hiding and encapsulation.
// The data members are not directly accessible, and we can control how they are set and retrieved.