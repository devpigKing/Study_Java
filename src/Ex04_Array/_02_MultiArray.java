package Ex04_Array;

public class _02_MultiArray {
    public static void main(String[] args) {
        // 4. 2차원 배열 (배열의 요소가 다른 배열인 경우)
        int[][] arr = new int[5][7];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = (int)(Math.random()*90)+10;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("[%d]", arr[i][j]);
            }
            System.out.println();
        }

        // 5. 2차원 배열 초기화 : {}를 중첩해서 각 배열의 초기 값 지정
        int[][] arr2 = new int[][] {{1,2}, {3,4}, {5,6}};

    }
}
