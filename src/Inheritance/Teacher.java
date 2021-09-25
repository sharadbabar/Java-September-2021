package Inheritance;

public class Teacher {
    int id;
    String name;
    String address;

}
class MathTeacher extends Teacher{
    public static void main(String[] args) {
        MathTeacher obj=new MathTeacher();
        obj.id=1;
        obj.name="Sharad";
        obj.address="Pune";

        System.out.println("id =>"+ obj.id+" Name =>"+obj.name+" Address=>"+obj.address);
    }
}
class PhysicsTeacher extends Teacher{
    public static void main(String[] args) {
        PhysicsTeacher obj=new PhysicsTeacher();
        obj.id=2;
        obj.name="Akash";
        obj.address="Mumbai";
        System.out.println("id =>"+ obj.id+" Name =>"+obj.name+" Address=>"+obj.address);
    }
}