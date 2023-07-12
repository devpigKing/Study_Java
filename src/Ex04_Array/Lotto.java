package Ex04_Array;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {

        // 로또 번호 추출기 만들기

        // 1. 6개의 숫자 뽑기 ( 조건 : 1 ~ 45, Random, 중복x ) + 배열에 저장
        // 2. 뽑힌 숫자의 평균 계산 //

        // 3. 평균 20 ~ 25 범위를 벗어나면 1부터 다시
        // 4. 뽑힌 숫자 출력
        // 5. 사용자가 원할 때까지 반복



            int[] arrLotto = new int[6];
            int sum = 0;

            for (int i = 0; i < arrLotto.length; i++) {
                int lotto = (int) (Math.random() * 45) + 1;
                for (int j = 0; j < i; j++) {
                    if(arrLotto[i] == arrLotto[j]) {
                        i--;
//                        i = -1;  // 처음부터 다시 뽑기
                        break;
                    }
                }
                arrLotto[i] = lotto;
                sum += arrLotto[i];

                System.out.printf("[%2d]", arrLotto[i]);

            }

            double avg = (double) sum / arrLotto.length;
            System.out.println();

            System.out.println(Arrays.toString(arrLotto));

            System.out.println();
            System.out.printf("[sum = %d]\n[avg = %.2f]", sum,avg);



    }
}
