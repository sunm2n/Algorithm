
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // 1<=k<=n<=30  이항계수 C(n-1,k-1)
        int n = sc.nextInt() - 1; // 정수n 입력 받기
        int k = sc.nextInt()  -1; // 정수k 입력 받기

        int answer = 1;

        // nCr = n!/(r!(n-r))!

        // nCr = nCn-r을 써서 r이 클 경우 계산이 커지는 것을 방지
        if(k > n - k){
            k = n-k;
        }

        // (n-k+1)부터 n까지 곱하고 k!로 나누기
        for (int i = 1; i <= k; i++) {
            answer = answer * (n - i + 1) / i;
        }

        // 결과 출력
        System.out.println(answer);
    }
}
