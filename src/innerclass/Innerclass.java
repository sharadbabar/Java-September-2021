package innerclass;

public class Innerclass {

    public void show(){
        System.out.println("OuterClass");
    }
    public static void main(String[] args) {
        Innerclass obj=new Innerclass();
        obj.show();
        Innerclass.InnerClass obj1= new Innerclass.InnerClass();
        obj1.innerShow();
    }
    static private class InnerClass{

        public void innerShow(){
            System.out.println("InnerClass");
        }
    }
}
