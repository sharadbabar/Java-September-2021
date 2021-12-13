package java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) throws Exception {
        Student obj=new Student(1,"Sharad",null);
        System.out.println(obj.getEmail());

        if (obj.getEmail()==null){
            System.out.println("Email is null");
        }else{
            System.out.println(obj.getEmail().toLowerCase());
        }

//        Optional<String>optional= Optional.empty();
//        System.out.println(optional);

//        Optional<String> optional1=Optional.of(obj.getEmail());  // it is used to throw an exception
//        System.out.println(optional1);
        //ofNullable is used to handle the null pointer exception
        Optional<String> optional2= Optional.ofNullable(obj.getEmail());
        System.out.println(optional2);


        Optional<String> optional3= Optional.ofNullable(obj.getEmail());
        System.out.println(optional3.orElse("Use another email(orElse)"));


        Optional<String> optional4= Optional.ofNullable(obj.getEmail());
        System.out.println(optional4.orElseGet(()->{
            return "Another email plz...";
        }));

        Optional<String> optional5= Optional.ofNullable(obj.getEmail());
        System.out.println(optional5.orElseThrow(()->{
            return new Exception("Custom Exception");
        }));
    }
}
class Student{
    int id;
    String name;
    String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
