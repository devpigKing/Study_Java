package Ex08_Inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {

        Ex08_Inheritance.Child tc = new Ex08_Inheritance.Child();
        tc.pm(); // 자식 클래스는 상속 받은 부모 클래스의 멤버를 포함하기 때문에 사용 가능
        tc.cm();

    }
}
