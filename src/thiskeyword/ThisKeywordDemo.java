package thiskeyword;

public class ThisKeywordDemo {
    int id;
    String name;
    String address;

    public  void display(){
        System.out.println("In Display");
    }
    public  void  show(){
        this.display();
    }

    public ThisKeywordDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }
    public ThisKeywordDemo(){
        this(5,"Rahul","Kolhapur");
    }

    public static void main(String[] args){
        ThisKeywordDemo obj = new ThisKeywordDemo(1, "Sharad", "Pune");
        System.out.println("\nId-->" + obj.id + "\nName-->" + obj.name + "\nAddress-->" + obj.address);
        obj.show();

        ThisKeywordDemo obj2=new ThisKeywordDemo();
        System.out.println("\nId -->"+obj2.id+"\nName -->"+obj2.name+"\nAddress -->"+obj2.address);

    }
}
/**
 *
 */
