package Ex08_Inheritance;

public class Parent {
    String pv;
    private String pv2;

    public Parent(String pv) {
        this.pv = pv;
        System.out.println("TheParent constructor 2");
    }

    void pm() {
        System.out.println("Parent.pm()");
    }
}
