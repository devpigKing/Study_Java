package Ex06_OOP;

public class PersonDemo2 {
    public static void main(String[] args) {

        Person2 person = new Person2();
        System.out.println(person.getNo());

        person.setName("도토리");
        person.setEmail("dotodiary@gmail.com");
        person.setPhone("010-1234-5678");

        String info = person.info();
        System.out.println(info);
    }
}
