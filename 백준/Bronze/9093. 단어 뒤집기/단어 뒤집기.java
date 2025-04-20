
/*
출력할 때 매번 System.out.println()을 사용하는 것은
출력마다 I/O가 발생 하므로 속도가 느리다.
따라서 StringBuiler에 모아서 한꺼번에 출력해야지 시간초과를 피할 수 있다.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine(); // 개행 처리

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            String[] part = str.split(" ");

            for (String word : part) {
                for (int j = word.length() - 1; j >= 0; j--) {
                    sb.append(word.charAt(j));
                }
                sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
