
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 역까지 걸리는 시간
        int A = sc.nextInt(); // 버스 도착시간
        int B = sc.nextInt(); // 지하철 도착시간

        if(N <= B) {
            if(A > B) {
                System.out.println("Subway");
            } else if (A < B) {
                System.out.println("Bus");
            } else {
                System.out.println("Anything");
            }
        } else {
            System.out.println("Bus");
        }
    }
}
