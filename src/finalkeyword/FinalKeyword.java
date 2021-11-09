package finalkeyword;
//The value of final variable cannot be changed
//The final method cannot be override
//The final class cannot be Inherited


public final class FinalKeyword{

    final int i=90;

    public void display(){
//        i=56;
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        FinalKeyword obj=new FinalKeyword();
        obj.display();
    }
}
