package Ex06_OOP;

class Person5 {
    public int no;
    public String name;
    public String phone;
    public String email;

    public String info() {
        String info = String.format("[%d][%s][%s][%s]" , no, name, phone, email);
        return info;
    }
}
public class PersonDemo5 {
    public static void main(String[] args) {

        int i1;
        i1 = 10;
        int i2 = i1;
        i2 = 20;
        System.out.println("i1 = " + i1);

        Person5 p1 = new Person5();
        p1.no = 10;
        Person5 p2 = p1;
        p2.no = 20;
        System.out.println("p1.no = " + p1.no);

    }
}
