package Java8;

public class MethodReferences {
    public static void main(String[] args) {

        MethodReferences obj=new MethodReferences();
        Myinterface3 myinterface3=obj::display;

        System.out.println(myinterface3.msg());


    }


    public String display(){
        return "hiii";
    }
}
@FunctionalInterface
interface  Myinterface3{
    String msg();
}