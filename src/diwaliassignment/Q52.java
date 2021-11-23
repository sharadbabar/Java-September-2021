package diwaliassignment;

public class Q52 {
    int roll;
    String name;
    int contactNo;
    int totalMarks;
public void read(int roll, String name, int contactNo,int totalMarks){
    this.roll=roll;
    this.name=name;
    this.contactNo=contactNo;
    this.totalMarks=totalMarks;

}
public void display(){
    System.out.println();
    System.out.println("Roll no->"+roll+"  Name->"+name+"  Contact->"+contactNo+"  Total Marks->"+totalMarks);
}

    public static void main(String[] args) {
    Q52 obj=new Q52();
    obj.read(1,"Sharad",9192,99);
    obj.display();

    }
}
