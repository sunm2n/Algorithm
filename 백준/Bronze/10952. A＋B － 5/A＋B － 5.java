import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int[] sum = new int[100];
        int n = 0;

        while(true){
            a = sc.nextInt(); // 첫 번째 수 입력 받기
            b = sc.nextInt(); // 두 번째 수 입력 받기
            sum[n] = a + b;  // 배열에 합 저장
            if(sum[n] == 0){  //  0 0 을 입력 받았을 때 반복문 탈출
                break;
            }
            n++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(sum[i]); // 출력
        }
    }
}