package Ex06_OOP;

public class PersonDemo3 {
    public static void main(String[] args) {

        Person2 person2 = new Person2();
        String info = person2.info();
        System.out.println(info);

        Person2 person3 = new Person2(28, "호롤로", "010-1234-6578", "dkwo@kakao.com");
        String info2 = person3.info();
        System.out.println(info2);
    }
}
