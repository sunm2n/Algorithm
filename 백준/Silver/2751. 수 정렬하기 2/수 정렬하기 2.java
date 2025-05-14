
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 수의 개수
        boolean []num = new boolean[2000001];
        int OFFSET = 1000000;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            num[input + OFFSET] = true;
        }

        int count = 0;
        for (int i = 0; i < num.length && count < N; i++) {
            if (num[i]) {
                sb.append(i - OFFSET).append("\n");
                count++;
            }
        }

        System.out.println(sb);
    }
}
