package Ex04_Array;

public class _01_Array {
    public static void main(String[] args) {

        // 1. 배열 만들기
        int[] arr;  // 참조 변수 만들기
        arr = new int[10]; // 인스턴스 만들기 + 인스턴스 주소를 arr(참조 변수)에 할당하기

        // 1-2. 배열 한번에 만들기
        int[] arr2 = new int[10]; // 한번에 할 수도 있음


        // 2. 배열 사용( 배열 요소 사용 )
        arr[0] = 50;
        arr2[2] = 5;

        System.out.print(arr[0] + arr2[2]);


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*900+100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
        System.out.println();


        // 3. 배열 초기화
        int[] arr3 = new int[10];  // new 연산자로 만든 인스턴스 변수는 자동으로 0이 초기화된다.
        for (int i = 0; i < arr3.length; i++) {
            System.out.printf("arr3[%d] = %d\n", i , arr3[i]);
        }

        int[] arr3_1 = new int[] {1, 2, 3, 4, 5}; // {}안의 값으로 배열 요소 초기화

        for (int i = 0; i < arr3_1.length; i++) {
            System.out.printf("arr3_1[%d] = %d\n", i, arr3_1[i]);
        }

        int[] arr3_2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr3_2.length; i++) {
            System.out.printf("arr3[%d] = %d\n", i , arr3_2[i]);
        }

        for (int v : arr3) {  // arr3의 각 요소를 순서대로 하나씩 뽑아서 v에 저장하고 반복 실행문을 실행
            System.out.printf("[%d]", v);
        }
    }
}
