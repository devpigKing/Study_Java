package Ex08_Inheritance;

class Parent2 {
    String pv;

    void pm() {
        System.out.println("Parent2.pm()");
    }
}

class Child2 extends Parent2 {
    String cv;

    void cm() {
        System.out.println("Child2.cm()");
    }
}
public class InheritanceDemo2 {
    public static void main(String[] args) {
        Parent2 p2 = new Child2(); // 부모 타입 참조 -> 자식 타입 인스턴스 접근 가능

//        Child2 c = new Parent2(); // 오류 : 자식 타입 참조 -> 부모 타입 인스턴스 접근 불가능
//        Child2 c = (Child2)new Parent2(); // 형변환 하더라도 죽는다.
        Child2 c2 = (Child2)p2;

        System.out.println(p2 instanceof Child2);
        System.out.println("End");
    }
}
