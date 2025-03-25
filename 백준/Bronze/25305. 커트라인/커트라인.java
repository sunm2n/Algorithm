import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int grade;
        int[] num = new int[N];
        int temp;

        for (int i = 0; i < N; i++) { // 배열 선언
            grade = sc.nextInt();
            num[i] = grade;
        }

        for (int i = 0; i < N; i++) { // 버블 정렬 내림차순으로
            for (int j = 1; j < N; j++) {
                if(num[j-1] < num[j]){
                    temp = num[j-1];
                    num[j-1] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println(num[K-1]);
    }
}