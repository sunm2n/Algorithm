import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N개의 과목 수
        int[] score = new int[N];
        int nscore; // 각 과목 점수 입력받기
        float sum = 0; // 모든과목 점수의 합

        for (int i = 0; i < N; i++) {
            nscore = sc.nextInt();
            score[i] = nscore;
        }

        Arrays.sort(score);
        int M = score[N-1]; // 최고점

        for (int i = 0; i < N; i++) {
            sum += score[i];
        }
        sum = (sum/M)*100;

        float avg = sum/N; // 평균산출
        System.out.println(avg);

    }
}