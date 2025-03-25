import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이트 입력 받기
        int k;
        int n;
        int sum = 0;
        int []arr = new int[14];
        
        for (int i = 0; i < T; i++) {
            k = sc.nextInt();
            n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                arr[j] = j+1;
            }
            for (int j = 0; j < k; j++) {
                for (int l = n-1; l >= 0; l--) {
                    for (int m = l-1; m >= 0 ; m--) {
                        arr[l] += arr[m];
                    }
                }
            }
            System.out.println(arr[n-1]);
        }
    }
}