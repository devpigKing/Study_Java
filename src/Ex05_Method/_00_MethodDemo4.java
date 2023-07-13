package Ex05_Method;

import java.util.Arrays;

public class _00_MethodDemo4 {

    public static void useArrayParam(int[] ar) {
        for( int v : ar) {
            System.out.println(v);
        }
    }

    public static int sum(int...values) {
        int result = 0;
        for (int v : values) {
            result += v;
        }
        return result;
    }

    // 불특정 개수의 전달인자를 받는 배열 전달인자 변수

    public static void main(String[] args) {
        int[] ar = {1, 2, 3};
        useArrayParam(ar);
        useArrayParam(new int[] {1,2,3,4});

        System.out.println(sum(1,2,3,4,5,6,7,8,9));
    }
}
