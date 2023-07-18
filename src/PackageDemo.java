import pkga.A; // 이후에 나오는 A는 pkga.A로 해석한다.

import java.util.Date;
import java.util.Scanner;

public class PackageDemo {
    public static void main(String[] args) {

        // 1. 패키지에 포함된 클래스를 사용할 때에는 패키지 이름도 같이 표시해야 한다.
        pkga.A a = new pkga.A();

        A a2 = new A();
        Scanner sc = new Scanner(System.in);
        Date d = new Date(0);
        System.out.println(d);

    }
}
