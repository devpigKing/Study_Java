package Ex06_OOP;

public class Person {

    // 특성 : 변수로 표현 : 필드
    int no;
    String name;
    String phone;
    String email;

    // 기능 : 메서드로 표현
    String info() {

//        String info = "[" + no + "]" + "[" + name + "]" + "[" + phone + "]" + "[" + email + "]";

        String info = String.format("[%d][%s][%s][%s]", no, name, phone, email); // 문자열 + 데이터의 결합

        return info;
    }

}
