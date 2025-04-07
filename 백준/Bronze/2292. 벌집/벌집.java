/*
문제 idea
벌집은 6방향으로 뻗어 나갈 수 있고 한 방향으로 뻗어나가게 되면
공차가 6인 계차 임을 알 수 있다.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 1; // 겹 수(최소 루트)
        int range = 2; // 범위 (최소값 기준)

        if(N == 1){
            System.out.println("1");
        } else {
            while(range <= N){
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
