package Ex02_Variables;

public class TypeAndVariables {

    public static void main(String[] args) {

        // 1. 변수 만들기 :
        // 자료형 변수이름;
        // 자료형 변수이름 = 값;

        // 이름이 i1인 4byte 정수형 변수 만들기 => int는 크기가 4byte인 정수형 자료형이다.
        int i1 = 10;
        System.out.printf("i1 = %d\n", i1);

        // i1 = 11.11; // 오류 : 정수형 변수에 실수형 값을 저장하면 오류

        // 실수형 변수 만들기
        double d1;
        d1 = 11.222;
        System.out.printf("d1 : %f", d1);
    }
}
