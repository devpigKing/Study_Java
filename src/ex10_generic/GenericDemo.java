package ex10_generic;

import java.util.Date;


// 제네릭과 오브젝트 둘다 여러가지 자료형을 한번에 쓰기 위함이지만,
// 오브젝트에서는 형변환을 잘못하면 프로그램이 죽기 때문에,
// 제네릭(아직 구체적으로 결정되지 않은 자료형 T 타입의 변수)을 사용한다.
// 오브젝트로도 형변환을 잘하면 사용가능하지만, 코드의 안정성을 위해 제네릭을 사용한다.

class TheObject {
    Object v; // 정수, 실수, 문자열, 날짜 등 모든 자료형의 데이터 저장

}

class TheGeneric<T, E> {
    T v; // 아직 구체적으로 결정되지 않은 자료형 T 타입의 변수 : 사용할 때 결정하도록 유예
    E v2;
    void m(T t) {

    }

    E m2() {
        return null;
    }

}


public class GenericDemo {
    public static void main(String[] args) {


        TheObject obj = new TheObject();
        obj.v = 10;
        obj.v = "문자열";
        obj.v = new Date();

        Date d = (Date) obj.v;
//        String s = (String)obj.v; // 에러 : 형변환 잘못하면 죽는다. ClassCastException


        ///////////////////////////////////

        TheGeneric<String, Integer> gen1 = new TheGeneric(); // TheGeneric<String, Integer>에서 T 타입은 String, E 타입은 Integer
        TheGeneric<Date, String> gen2 = new TheGeneric();

        gen1.v = "문자열 1";
        gen2.v = new Date();

        String s = gen1.v;  // 읽을 때 형변환 필요하지 않음
        Date d2 = gen2.v; // 읽을 때 형변환 필요하지 않음


        System.out.println("End of Program");

    }
}
