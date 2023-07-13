package Ex05_Method;

import java.util.Scanner;

public class _00_MethodDemo2 {

    private static void drawBox(String a) {

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 20; col++) {
                if ( row == 0 || row == 9 || col == 0 || col == 19) {
                    System.out.print(a);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        System.out.print("박스 그리기에 사용할 문자 : ");
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();

        drawBox(ch);

    }
}
