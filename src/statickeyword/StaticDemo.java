package statickeyword;

public class StaticDemo {
    static String companyName = "ABC";
    int id;
    String name;

    public StaticDemo(int id, String name) {
        this.id = id;
        this.name = name;
        this.companyName="String company";

    }

    public static void main(String[] args) {
        StaticDemo obj = new StaticDemo(1, "Suhas");
        StaticDemo obj2 = new StaticDemo(2, "Darshan");
        obj.display();
        obj2.display();
    }

    void display() {
        System.out.println("\nid-->" + id + "\nname-->" + name + "\nCompany-->" + companyName);
    }
}
