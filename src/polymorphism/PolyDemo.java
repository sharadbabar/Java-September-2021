package polymorphism;
//Method Overloading

public class PolyDemo {

    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        PolyDemo obj=new PolyDemo();
        System.out.println(obj.add(4.5,5.5));
        System.out.println(obj.add(5,6));
    }
}
