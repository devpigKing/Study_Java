package myCode;

import java.util.Scanner;

public class ConsoleInputOutput {

    public static void main(String[] args) {

        System.out.print("이름을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();


        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.println("[" + name + "][" + age + "]");
        System.out.printf("[%s][%d]", name, age);


        // %s : 문자열
        // %d : 정수
        // %f : 실수
        // %c : 문자
        // %b : boolean
    }
}
