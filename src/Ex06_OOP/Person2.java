package Ex06_OOP;

public class Person2 {

    // 특성 : 변수로 표현 : 필드
    // private : 접근지정자 => 외부에서 접근할 수 없음.
    private int no;
    private String name;
    private String phone;
    private String email;

    // 기능 : 메서드로 표현
    // public : 접근지정자 => 어디서든 접근 가능함.
    public String info() {
        String info = String.format("[%d][%s][%s][%s]", no, name, phone, email); // 문자열 + 데이터의 결합
        return info;
    }

    class PersonDemo2 {
        public static void main(String[] args) {

            Person2 person = new Person2();
            person.no = 10; // 외부의 접근 => 자바에서는 보호해야함 => 은닉화 => 데이터의 무결성을 지키기위해


        }
    }
}
