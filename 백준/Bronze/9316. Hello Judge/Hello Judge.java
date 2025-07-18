import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 반복 횟수

        for (int i = 1; i <= N; i++) {
            System.out.println("Hello World, Judge " + i + "!");
        }
    }
}