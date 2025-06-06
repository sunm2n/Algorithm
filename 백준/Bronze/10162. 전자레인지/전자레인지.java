
/**
 * 나의 idea
 * 어차피 제일 작은 C가 10초 이기 때문에 입력된 T값의 1의 자리 수가 0이 아니면
 * T초를 맞출 수 가 없다 따라서 0인지 아닌지 먼저 확인 하고 자릿수를 한자리 낮춰서 계산한다.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int []time = {30, 6, 1};
        int []count = new int[3];
        int T = sc.nextInt(); // 요리 시간

        if(T % 10 != 0) {
            System.out.println("-1");
            return;
        } else {
            T /= 10;
        }

        for (int i = 0; i < 3; i++) {
            count[i] = T / time[i];
            T %= time[i];
        }

        System.out.println(count[0] + " " + count[1] + " " + count[2]);
    }
}
