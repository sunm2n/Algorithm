
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        String str = sc.next();
        long num;
        long sum = 0;

        for (int i = 0; i < L; i++) {
            num = (str.charAt(i) - 96);
            for (int j = 0; j < i; j++) {
                num *= 31;
                num %= 123456791; // num 의 사이즈가 커져 오버플로우가 되는 것을 방지
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
