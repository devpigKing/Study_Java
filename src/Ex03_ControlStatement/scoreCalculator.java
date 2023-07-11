package Ex03_ControlStatement;

import java.util.Scanner;

public class scoreCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        main : while (true) {
            System.out.println("******************************");
            System.out.println("    1. 점수 처리하기.");
            System.out.println("    2. 종료");
            System.out.println("******************************");
            System.out.print("작업을 선택하세오 : ");
            String selection = sc.next();

            System.out.println();

            switch (selection) {
                case "1":
                    System.out.print("첫번째 점수 1 : ");
                    int score1 = sc.nextInt();
                    System.out.print("첫번째 점수 2 : ");
                    int score2 = sc.nextInt();
                    System.out.print("첫번째 점수 3 : ");
                    int score3 = sc.nextInt();

                    int sum = score1 + score2 + score3;
                    int avg = sum / 3;
                    char grade = 'I';
                    if(avg >= 90 && avg <= 100) {
                        grade = 'A';
                    } else if (avg >= 80 && avg < 90) {
                        grade = 'B';
                    } else if (avg >= 70 && avg < 80) {
                        grade = 'C';
                    } else if (avg >= 60 && avg < 70) {
                        grade = 'D';
                    } else if (avg >= 0 && avg < 60){
                        grade = 'F';
                    } else {
                        System.out.println("점수 입력 오류");
                    }
                    if (grade != 'I') {
                        System.out.printf("[Total : %d]\n" + "[Average : %d]\n" + "[Grade : %c]\n", sum, avg, grade);
                    }
                    break;
                case "2":
                    System.out.println("프로그램을 종료합니다.");
                    break main;
                default:
                    System.out.println("지원하지 않는 작업입니다.");
            }

            System.out.println();
        }

    }
}
