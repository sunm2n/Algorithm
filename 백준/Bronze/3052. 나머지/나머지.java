import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] divison = new int[10]; // 42로 나눈 나머지를 담을 배열
        int num= 0; // 스캐너로 입력받을 값
        int count = 1; // 중복될 때마다 1씩 플러스

        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();
            divison[i] = num % 42;
        }

        Arrays.sort(divison);

        for (int i = 0; i < 9; i++) {
            if (divison[i] < divison[i+1]){
                count++; // 중복되는 횟수
            }
        }

        System.out.println(count);

    }
}