package Ex05_Method;

public class _00_MethodDemo3 {

    // 두 정수를 더하는 함수 만들기
    public static int sum(int a, int b) {
        int result = a + b;
        return result; // return; --> 함수 종료, return 값; --> 함수를 종료하고 호출한 곳으로 값 변환
    }

    public static void main(String[] args) {

        System.out.println(sum(99, 99));

    }
}
