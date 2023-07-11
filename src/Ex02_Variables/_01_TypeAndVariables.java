package Ex02_Variables;

public class _01_TypeAndVariables {

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

        // 2. 문자 자료형
        // 'A' - 65(아스키 코드)로 저장한다.
        char ch = 'a';
        System.out.println(ch);
        System.out.println((int)ch);

        // 3. 문자열 자료형, 문자열 자료형은 큰따옴표!
        String a = "가나다라마바사";
        System.out.println(a);
        String a2 = "가나다\"라마\'바사\n 두번째 행\t 탭 이후에 내용 \b다시 처음으로";
        System.out.println(a2);

        //escape sequence (탈출 문자)
        // \n : enter
        // \t : tap
        // // : \
        // \" : "
        // \' : '


        // 4. 진위형 : boolean
        boolean b1 = true;
        System.out.println(b1);
//        System.out.println((int) b1); // 오류 :  boolean과 int는 호환되지 않는 자료형


        // 5. 형변환 : 어떤 자료형의 데이터를 다른 자료형으로 변경 (변수의 자료형은 변하지 않는다.)
        int i2 = 10;
        double d2 = i2; // 형 변환 : i2의 값이 int => double : 자동(암시적) 형변환
        System.out.println(d2);

        double d3 = 123.4;
        int i3 = (int) d3;  // 형변환 d3의 값이 double -> int : 명시적 형변환
        System.out.println(i3); // 데이터의 손실이 발생하면 명시적으로 선언해줘야 한다.
        System.out.printf("%f, %d\n", d2, i3);

    }
}
