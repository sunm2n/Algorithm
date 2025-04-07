import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];
        int pointer = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.startsWith("push")) {
                int value = Integer.parseInt(str.split(" ")[1]);
                stack[pointer++] = value;
            } else if (str.equals("pop")) {
                if (pointer == 0) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack[--pointer]).append("\n");
                }
            } else if (str.equals("size")) {
                sb.append(pointer).append("\n");
            } else if (str.equals("empty")) {
                sb.append(pointer == 0 ? "1\n" : "0\n");
            } else if (str.equals("top")) {
                if (pointer == 0) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack[pointer - 1]).append("\n");
                }
            }
        }

        System.out.print(sb); // 한 번에 출력
    }
}
