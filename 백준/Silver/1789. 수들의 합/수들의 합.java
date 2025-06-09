import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long S = sc.nextLong(); // 서로 다른 N개의 자연수의 합 S

        int count = 0;
        long i = 1;
        while (S > 0) {
            S -= i;
            i++;
            if (S >= 0) count++;
        }

        System.out.println(count);
    }
}
