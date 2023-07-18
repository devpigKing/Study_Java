package Ex08_Inheritance;

public class Child extends Parent{ // 상속을 표현 --> Parent의 모든 멤버가 Child에 포함

    String cv;

    public Child() {
        // 자식 클래스의 인스턴스 생성 -> ( 부모 클래스의 생성자 호출 ) -> 자식 클래스의 생성자 메서드 호출
        super("2");
        System.out.println("Child constructor");
    }

    void cm() {
        System.out.println("Child.cm()");

        pv = "테스트";
        super.pv = "테스트2";
        //    pv2 = 20; // 오류 : 부모 클래스의 private 멤버는 사용할 수 없다.
        System.out.println("Child.cm()");
    }

}
