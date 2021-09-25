package encapsulation;

public class EncapsulationDemo {
    private int id;
    private String name;
    private String address;

    public static void main(String[] args) {
        EncapsulationDemo obj=new EncapsulationDemo();
        obj.setId(1);
        System.out.println(obj.getId());
    }
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id){
        this.id=id;

    }
}
//Abstraction
//Polymorphism
//Inheritance
//Encapsulation
//Class
//Object