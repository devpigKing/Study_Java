package Ex05_Method;

public class _00_MethodDemo {

    // 메서드 정의 (만들기)
    private static void drawBox() {

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 20; col++) {
                if ( row == 0 || row == 9 || col == 0 || col == 19) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        drawBox(); // 매서드 실행

    }
}
