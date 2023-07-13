package Ex05_Method;

public class _00_MethodDemo {

    public static void drawBox() {
        // 20 x 10 크기의 박스 그리기

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

        drawBox();

    }
}
