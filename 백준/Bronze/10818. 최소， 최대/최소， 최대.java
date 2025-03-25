import java.util.Scanner;
import java.util.Arrays;         // Arrays.sort()를 쓰기 위해서

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정수 N개
        int[] num = new int[n]; // 배열
        int put;                // 입력 받을 숫자들

        for (int i = 0; i < n; i++) {
            put = sc.nextInt();
            num[i] = put;
        }

        Arrays.sort(num); // 배열의 오름차순 정렬

        System.out.println(num[0] + " " + num[n-1]);

    }
}