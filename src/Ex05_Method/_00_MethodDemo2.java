package Ex05_Method;

import java.util.Scanner;

public class _00_MethodDemo2 {

    private static void drawBox(String a, int b, int c) {

        for (int row = 0; row < c; row++) {
            for (int col = 0; col < b; col++) {
                if ( row == 0 || row == c-1 || col == 0 || col == b-1) {
                    System.out.print(a);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("박스 그리기에 사용할 문자 : ");
        String ch = sc.nextLine();

        System.out.print("박스 너비 : ");
        int weight = sc.nextInt();

        System.out.print("박스 높이 : ");
        int height = sc.nextInt();


        drawBox(ch, weight, height);

    }
}
