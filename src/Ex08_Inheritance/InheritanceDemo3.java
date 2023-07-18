package Ex08_Inheritance;


class Parent3 {

    void pm() {
        System.out.println("Parent.pm()");
    }

    void m() {
        System.out.println("Parent.m()");
    }
}

class Child3 extends Parent3{
    String cv;

    void cm() {
        System.out.println("Child3.cm()");
    }

    // 부모 클래스의 메서드 변경 : 메서드 이름, 전달인자 결과형은 동일하게 만들고 내용을 다르게 구현
    void m() {
        System.out.println("Child.m()");
    }
}
public class InheritanceDemo3 {

    public static void main(String[] args) {
        // 오버라이딩된 메서드는 현재 타입에 따라 호출된다.
        Parent3 p = new Parent3();
        p.m();
        Child3 c = new Child3();
        c.m();

        Parent3 p2 = new Child3();
        p2.m();
    }

}
