package Ex03_ControlStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // 1. 숫자 입력
        // 2. 연산자 입력
        // 3. 숫자 입력
        // 4. 연산 (선택문)
        // 5. 출력
        // ** 자바는 문자열의 내용을 비교할 때 equals 메서드를 사용해야 한다.

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 : ");
        int num1 = sc.nextInt();
        System.out.print("첫 번째 연산자 : ");
        String oper = sc.next();
        System.out.print("두 번째 숫자 : ");
        int num2 = sc.nextInt();

        int result = 0;
        if(oper.equals("+")) {
            result = num1 + num2;
            System.out.println("두 수의 합은 : " + result);
        } else if (oper.equals("-")) {
            result = num1 - num2;
            System.out.println("두 수의 차는 : " + result);
        } else if (oper.equals("*")) {
            result = num1*num2;
            System.out.println("두 수의 곱은 : " + result);
        } else if (oper.equals("/")) {
            result = num1/num2;
            System.out.println("두 수의 나누기는 : " + result);
        } else {
            System.out.println("잘못된 연산자입니다. ");
        }
    }
}
