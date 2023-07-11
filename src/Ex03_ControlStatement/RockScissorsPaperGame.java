package Ex03_ControlStatement;

import java.util.Scanner;

public class RockScissorsPaperGame {
    public static void main(String[] args) {


        // 가위 바위 보 게임
        // 1. 컴퓨터 선택 (난수, 0: 가위 or 1: 바위 or 2:보)
        // 2. 사용자 선택 (입력, 0: 가위 or 1: 바위 or 2:보)
        // 3. 컴퓨터와 사용자의 선택 비교해서 승/무/패 결정
        // 4. 결과 출력 (사용자 선택, 컴퓨터 선택, 결과)
        // 5. 사용자가 원할 때 까지 반복(메뉴)

        Scanner sc = new Scanner(System.in);

        main : while (true) {
            System.out.println("******************************");
            System.out.println("    1. 가위바위보 하기");
            System.out.println("    2. 종료");
            System.out.println("******************************");
            System.out.print("선택 : ");
            String select = sc.next();

            System.out.println();

            switch (select) {
                case "1":
                    double rv = Math.random()*3;
                    int computer = (int)rv;

                    System.out.print("어떤 것을 내시겠습니까??(입력, 0: 가위 or 1: 바위 or 2:보) : ");
                    int num = sc.nextInt();

                    if(num == 0) {
                        if(computer == 0) {
                            System.out.printf("사용자 선택 : %d\n", num);
                            System.out.printf("컴퓨터 선택 : %d\n", computer);
                            System.out.println("결과 : 비겼습니다.");
                        } else if(computer == 1) {
                            System.out.printf("사용자 선택 : %d\n", num);
                            System.out.printf("컴퓨터 선택 : %d\n", computer);
                            System.out.println("결과 : 졌습니다.");
                        } else if(computer == 2) {
                            System.out.printf("사용자 선택 : %d\n", num);
                            System.out.printf("컴퓨터 선택 : %d\n", computer);
                            System.out.println("결과 : 이겼습니다.");
                        } else {
                            System.out.printf("사용자 선택 : %d\n", num);
                            System.out.printf("컴퓨터 선택 : %d\n", computer);
                            System.out.println("잘못된 값을 입력하셨습니다.");
                        }
                    } else if(num == 1) {
                        if(computer == 0) {
                            System.out.printf("사용자 선택 : %d\n", num);
                            System.out.printf("컴퓨터 선택 : %d\n", computer);
                            System.out.println("결과 : 이겼습니다.");
                        } else if(computer == 1) {
                            System.out.printf("사용자 선택 : %d\n", num);
                            System.out.printf("컴퓨터 선택 : %d\n", computer);
                            System.out.println("결과 : 비겼습니다.");
                        } else if(computer == 2) {
                            System.out.printf("사용자 선택 : %d\n", num);
                            System.out.printf("컴퓨터 선택 : %d\n", computer);
                            System.out.println("결과 : 졌습니다.");
                        } else {
                            System.out.printf("사용자 선택 : %d\n", num);
                            System.out.printf("컴퓨터 선택 : %d\n", computer);
                            System.out.println("잘못된 값을 입력하셨습니다.");
                        }
                    } else if(num == 2) {
                        if(computer == 0) {
                            System.out.printf("사용자 선택 : %d\n", num);
                            System.out.printf("컴퓨터 선택 : %d\n", computer);
                            System.out.println("결과 : 졌습니다.");
                        } else if(computer == 1) {
                            System.out.printf("사용자 선택 : %d\n", num);
                            System.out.printf("컴퓨터 선택 : %d\n", computer);
                            System.out.println("결과 : 이겼습니다.");
                        } else if(computer == 2) {
                            System.out.printf("사용자 선택 : %d\n", num);
                            System.out.printf("컴퓨터 선택 : %d\n", computer);
                            System.out.println("결과 : 비겼습니다.");
                        } else {
                            System.out.printf("사용자 선택 : %d\n", num);
                            System.out.printf("컴퓨터 선택 : %d\n", computer);
                            System.out.println("잘못된 값을 입력하셨습니다.");
                        }
                    } else {
                        System.out.printf("사용자 선택 : %d\n", num);
                        System.out.printf("컴퓨터 선택 : %d\n", computer);
                        System.out.println("잘못된 값을 입력하셨습니다.");
                    }
                    break;
                case "2":
                    System.out.println("프로그램을 종료합니다.");
                    break main;
                default:
                    System.out.println("지원하지 않는 작업입니다.");
            }
        }
        System.out.println();

    }
}
