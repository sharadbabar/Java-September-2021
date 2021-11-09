package superkeyword;

public class SuperKeyword {
    int i = 89;

    public SuperKeyword() {
        System.out.println("In Default SuperKeyword Constructor");
    }

    public SuperKeyword(int i){
        System.out.println("In Para Const SuperKeyword");
    }

    public void show() {
        System.out.println("IN parent class!!!");
    }

}

class A extends SuperKeyword {
    int i = 90;
    public A(){
        System.out.println("In Default A Constructor");
    }

    public A(int i){
        super(i);
        System.out.println("In Para A Constructor");
    }

    public static void main(String[] args) {
        A obj = new A(7);

//        obj.show();
    }

    public void show() {
        super.show();
        System.out.println("i-->" + super.i);
        System.out.println("i-->" + i);


    }
}
//1. Refers to the immidiate parent class varriable
//2. Refers to the immidiate parent class methods
//3.refers the parent class constructor

//Object is the root class of all classes