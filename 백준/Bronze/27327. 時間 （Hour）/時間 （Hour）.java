import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong(); // N일
        System.out.println(N * 24); // N일을 시간으로 환산
    }
}
