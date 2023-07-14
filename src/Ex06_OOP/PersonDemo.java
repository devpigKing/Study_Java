package Ex06_OOP;

public class PersonDemo {

    public static void main(String[] args) {

        int x;
        int[] ar = new int[10];

        Person person = new Person();

        person.no = 20;
        person.name = "Dotori";
        person.email = "dotodiary@gmail.com";
        person.phone = "010-1234-6681";


        String info = person.info();

        System.out.println(info);
    }
}
