package ex06_OOP;

interface A {
    public static final int a = 3;
    public abstract void abc();
}

interface B {
    int b = 3;
    void bcd();
}

class ExInplementation implements A {

    // 인터페이스를 구현하는 클래스는 모든 추상메서드(본문없는 메서드)를 구현해야 한다.
    @Override
    public void abc() {
        System.out.println("abc()");
    } // implements : 인터페이스를 구현하는 표시 ( 상속과 비슷 )

}

// 인터페이스는 다른 클래스에 의해서 구현되는 방식으로 사용 ( 추상 메서드의 내용 채우기 )
public class InterfaceDemo {
    public static void main(String[] args) {

        // 인터페이스는 인스턴스를 만들 수 없다. (참조 변수만 만들 수 있다.)

        System.out.println(A.a);
        System.out.println(B.b);

        //인터페이스 참조 = 구현클래스 인스턴스 방식으로 사용
        A a1;
        a1 = new ExInplementation();
    }
}
