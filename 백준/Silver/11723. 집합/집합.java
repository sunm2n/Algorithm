
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] arr = new boolean[21];
        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String s = br.readLine();

            if (s.equals("all")) {
                Arrays.fill(arr, true);
            } else if (s.equals("empty")) {
                Arrays.fill(arr, false);
            } else {
                String[] str = s.split(" ");
                int x = Integer.parseInt(str[1]);

                switch (str[0]) {
                    case "add":
                        arr[x] = true;
                        break;
                    case "remove":
                        arr[x] = false;
                        break;
                    case "check":
                        sb.append(arr[x] ? "1\n" : "0\n");
                        break;
                    case "toggle":
                        arr[x] = !arr[x];
                        break;
                }
            }
        }

        System.out.print(sb);
    }
}
