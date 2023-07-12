package Ex05_Method;

public class _01_Method {

    public static void startHello() {
        System.out.println("메서드를 시작해볼까요???");
    }
    public static void main(String[] args) {
        System.out.println("메서드 호출 전");
        startHello();
        startHello();
        startHello();
        System.out.println("메서드 호출 후");
    }
}
