
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 던진 성냥 개수
        int W = sc.nextInt(); // 가로 크기
        int H = sc.nextInt(); // 세로 크기

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt(); // 성냥의 길이
            if(a * a > W * W + H * H){
                System.out.println("NE");
            } else {
                System.out.println("DA");
            }
        }

    }
}
