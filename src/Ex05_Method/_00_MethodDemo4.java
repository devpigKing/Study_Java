package Ex05_Method;

import java.util.Arrays;

public class _00_MethodDemo4 {

    public static void useArrayParam(int[] ar) {
        for( int v : ar) {
            System.out.println(v);
        }
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3};
        useArrayParam(ar);
        useArrayParam(new int[] {1,2,3,4});
    }
}
