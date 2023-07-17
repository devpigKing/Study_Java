package Ex06_OOP;

public class PersonDemo4 {
    public static void main(String[] args) {

        Person2 p1 = new Person2();
        p1.setNo(1);
        Person2.nextNo = 1;


        Person2 p2 = new Person2();
        p2.setNo(2);
        Person2.nextNo = 2;

        System.out.printf("P1 : %d-%d\n", p1.getNo(), Person2.nextNo);
        System.out.printf("P1 : %d-%d\n", p2.getNo(), Person2.nextNo);



    }
}
