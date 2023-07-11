package Ex03_ControlStatement;

public class BreakAndContinue {
    public static void main(String[] args) {

        outer: for (int i = 0; i < 10; i++) {
            System.out.printf("[i %d]\n", (i+1));
            inner: for (int j = 0; j < 10; j++) {
                System.out.printf("[j = %d]", (j+1));

                if( i == 5) {
                    break outer;
                }
            }

            System.out.println();

        }

    }
}
