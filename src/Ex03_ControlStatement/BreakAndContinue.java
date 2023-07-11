package Ex03_ControlStatement;

public class BreakAndContinue {
    public static void main(String[] args) {

        // outer는 for문에 대한 이름 : label문 이라고 한다.
        outer: for (int i = 0; i < 10; i++) {
            System.out.printf("[i %d]\n", (i+1));
            inner: for (int j = 0; j < 10; j++) {
                System.out.printf("[j = %d]", (j+1));

                if( i == 5) {
                    break outer; // outer 이름이 붙은 반복문 or switch문 중단.
                }
            }

            System.out.println();

        }

    }
}
