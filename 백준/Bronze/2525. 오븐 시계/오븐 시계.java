import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(); // 시간
        int M = sc.nextInt(); // 분
        int K = sc.nextInt(); // 필요한 시간(분)

        if((M + K) >= 60 ) {
            H += ((M + K) / 60);
            M = (M + K) % 60;
        } else {
            M += K;
        }

        if(H >= 24) {
            H -= 24;
        }
        System.out.println(H + " " + M);
    }
}