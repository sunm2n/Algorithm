import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();
           
            long n = Long.parseLong(input);

            if (n == 0) {
                break;
            }

            // 등차수열의 합 공식: n(n+1)/2
            long result = (n * (n + 1)) / 2;

            sb.append(result).append('\n');
        }

        System.out.print(sb);
    }
}