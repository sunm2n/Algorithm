
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt(); // 운동해야 하는 시간(분)
    int m = sc.nextInt(); // 초기 맥박
    int M = sc.nextInt(); // 최대 맥박
    int T = sc.nextInt(); // 1분 운동 시 맥박 증가
    int R = sc.nextInt(); // 1분 휴식 시 맥박 감소

    // 한 번도 운동 못 하는 경우
        if (m + T > M) {
        System.out.println(-1);
        return;
    }

    int time = 0;     // 전체 경과 시간
    int cnt = 0;      // 운동한 분 수
    int pulse = m;    // 현재 맥박

        while (cnt < N) {
        if (pulse + T <= M) {
            // 운동 가능
            pulse += T;
            cnt++;
        } else {
            // 휴식
            pulse -= R;
            if (pulse < m) pulse = m;
        }
        time++;
    }
        System.out.println(time);
    }
}

