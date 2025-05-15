
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];
        int pointer = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if (s.startsWith("1")) {
                stack[pointer++] = Integer.parseInt(s.substring(2));
            } else if (s.equals("2")) {
                if(pointer == 0) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack[--pointer]).append("\n");
                }
            } else if (s.equals("3")) {
                sb.append(pointer).append("\n");
            } else if (s.equals("4")) {
                sb.append(pointer == 0 ? "1\n" : "0\n");
            } else if (s.equals("5")) {
                if (pointer == 0) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack[pointer - 1]).append("\n");
                }
            }
        }

        System.out.print(sb);
    }
}
