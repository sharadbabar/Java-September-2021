package abstraction;

public class Cricket implements SportInterface,SportInterface2 {

    @Override
    public void play() {
        System.out.println("In Cricket Play");

    }

    public static void main(String[] args) {
        Cricket obj=new Cricket();
        obj.play();
    }
}
