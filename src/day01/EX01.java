package day01;

public class EX01 {
    public static void main(String[] args) {
        // 점수를 받는 변수, 87점
        // 90점 이상: A
        // 80점 이상: B
        // 70점 이상: C
        // 나머지: F

        int score = 87;
        char degree = score >= 90 ? 'A'
                : score >= 80 ? 'B'
                : score >= 70 ? 'C'
                : 'F';

        System.out.println(degree);
        System.out.printf("%c", degree);
    }
}
