import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 비즈니스 줄당 좌석 수
        int b = sc.nextInt(); // 비즈니스 줄 수
        int c = sc.nextInt(); // 이코노미 줄당 좌석 수
        int d = sc.nextInt(); // 이코노미 줄 수

        int totalSeats = a * b + c * d;
        System.out.println(totalSeats);
    }
}