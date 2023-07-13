package Ex05_Method;

public class _00_MethodDemo5 {

    public static int add(int a, int b) { // int 전달인자 2개를 사용하는 add 메서드 호출

        return a + b;
    }

    public static int add(String a, String b) { // String 전달인자 2개를 사용하는 add 메서드를 호출
        int ia = Integer.parseInt(a);
        int ib = Integer.parseInt(b);
        return ia + ib;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 자바의 메서드는 이름 + 전달인자의 개수, 자료형, 순서를 반영해서 구분
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나

        int result = add(10, 20);
        System.out.println(result);

        result = add("100", "400");
        System.out.println(result);
    }
}
