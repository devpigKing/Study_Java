package Ex02_Variables;

public class _03_TypeCasting {
    public static void main(String[] args) {
        // TypeCasting은 형 변환을 뜻함.

        // int to double, float
        int score = 99;
        System.out.println(score);
        System.out.println((double) score);
        System.out.println((float) score);

        // float, double to int
        double score_f = 93.3F;
        double score_d = 99.9;
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double(자동 형변환)

        int convertedScoredInt = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        System.out.println(s1);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(92.8);
        System.out.println(s2);
        s2 = Double.toString(92.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

//        int error = Integer.parseInt("자바");
    }
}
