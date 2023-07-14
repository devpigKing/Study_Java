package Ex05_Method;

import java.util.Arrays;
import java.util.Scanner;

public class _04_BaseballGame {

    static Scanner sc = new Scanner(System.in);

    public static String selectTask() {
        System.out.println("**************************************");
        System.out.println("* 1. 야구 게임 시작                    *");
        System.out.println("* 2. 전적 보기                         *");
        System.out.println("* 3. 종료                             *");
        System.out.println("**************************************");
        System.out.print("작업을 선택하세요 : ");
        String selection = sc.nextLine();

        return selection;
    }

    public static int[] randomSave() {
        int[] nums = new int[3];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random()*9);

        }
        return nums;
    }
    public static void main(String[] args) {

        // 1. 컴퓨터 숫자 선택(0 ~ 9, random, 3개) --> 저장

        // 2. 사용자 숫자 선택(0~9, 입력, 3개) --> 배열에 저장

        // 3. 컴퓨터 숫자와 사용자 선택 비교 후 결과 판정( S, B, O ) --> 35가 나오면 Win, 아니면 2부터 다시, 10회 반복되면 Lose

        // 사용자가 원하는 동안 반복



        main_loop: while (true) {
            String selection = selectTask();

            System.out.println();
            switch (selection) {
                case "1":
                    int[] nums = randomSave();
                    System.out.println(Arrays.toString(nums));
                    break;

                case "2": break;
                case "3":
                    System.out.println("프로그램을 종료합니다.");
                    break main_loop;
                default:
                    System.out.println("지원하지 않는 작업입니다.");
                    break ;
            }
            System.out.println();
        }

    }
}
