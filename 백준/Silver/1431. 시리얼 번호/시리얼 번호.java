
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 시리얼 번호의 수
        sc.nextLine();// 개행 처리

        String []num = new String[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextLine();
        }

        Arrays.sort(num, (a, b) -> {
            // 1. 길이 비교
            if(a.length() != b.length()) {
                return a.length() - b.length();
            }

            // 2. 숫자 합 비교
            int sum_a = sum(a);
            int sum_b = sum(b);
            if(sum_a != sum_b) {
                return sum_a - sum_b;
            }

            // 3. 사전순 비교
            return a.compareTo(b);
        });
        
        // 출력
        for (String s : num) {
            System.out.println(s);
        }
    }

    // 문자열 안의 숫자의 합을 계산하는 함수
    public static int sum(String s) {
        int sum = 0;
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                sum += c - '0';
            }
        }
        return sum;
    }
}
