package Ex05_Method;

public class _02_Parameter {

    public static void power(int num) {
        int result = num * num;
        System.out.println(num + " 의 2 승은 " + result);
    }

    public static void powerByExp(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        System.out.println(num + " 의 " + exp + " 승은 " + result);
    }
    public static void main(String[] args) {

        power(2);
        power(8);

        powerByExp(2,9);
    }
}
