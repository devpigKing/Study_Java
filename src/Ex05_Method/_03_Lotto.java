package Ex05_Method;

import java.util.Scanner;

public class _03_Lotto {

    static java.util.Scanner scanner = new java.util.Scanner(System.in);


    public static void lotto1(int[] numbers, double avg) {
            System.out.print("[당첨 예상 번호]:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.printf("[%2d]", numbers[i]); // %2d : 2칸을 확보해서 출력
            }
            System.out.printf("[%.2f]\n", avg); // %.2f : 소수점 이하 2자리 출력
        }


        public static int[] selectBasicNumbers() {
            // numbers = selectBasicNumbers();
            int[] numbers = new int[6];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (int)(Math.random() * 45) + 1;

                // 중복 검사 반복문 ( 현재 뽑힌 i번째 번호와 0 ~ i-1번째 번호 비교 )
                for (int j = 0; j < i; j++) {
                    if (numbers[i] == numbers[j]) {
                        i--; // i 반복문에서 i++로 넘어가는 것을 상쇄하기 위해 --처리
                        // i = -1; // i 반복문에서 i를 0으로 만들어서 처음부터 다시 뽑기
                        break;
                    }
                }
            }

            return numbers;
        }

        public static double getAverage(int[] numbers) {
            int sum = 0;
            double avg = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i]; // sum = sum + numbers[i];
            }
            avg = (double)sum / numbers.length;

            return avg;
        }

        public static String selectTask() {
            System.out.println("**************************************");
            System.out.println("* 1. 당첨 예상 번호 뽑기                 *");
            System.out.println("* 2. 종료                             *");
            System.out.println("**************************************");
            System.out.print("작업을 선택하세요 : ");
            String selection = scanner.nextLine();

            return selection;
        }

        public static int[] selectWinningNumbers() {
            int[] numbers;
            double avg;
            do {
                // numbers = selectBasicNumbers();

                numbers = selectBasicNumbers();


                // 2. 뽑힌 숫자의 평균 계산
                // avg = getAverage(?);

                avg = getAverage(numbers);

            } while (avg < 20 || avg > 26);
            return numbers;
        }



        public static void main(String[] args) {
            // 로또 번호 추출기 만들기


            // 5. 사용자가 원할 때까지 반복 ( 메뉴 시스템으로 구현 )
            main_loop : while (true) {

                String selection = selectTask();

                System.out.println();
                switch (selection) {
                    case "1":
                        int[] numbers = selectWinningNumbers();
                        double avg = getAverage(numbers);
                        // 3. 평균이 20 ~ 26 범위를 벗어나면 1부터 다시

                        java.util.Arrays.sort(numbers);
                        // 4. 뽑힌 숫자 출력
                        lotto1(numbers, avg);

                        break;
                    case "2":
                        System.out.println("행운을 빕니다. 부자되세요");
                        System.out.println("프로그램을 종료합니다.");
                        break main_loop;
                    default:
                        System.out.println("지원하지 않는 작업입니다.");
                }
                System.out.println();
            }
        }



}



