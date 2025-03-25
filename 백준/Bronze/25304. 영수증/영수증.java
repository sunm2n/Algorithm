import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt(); // 총 금액
        int pcs = sc.nextInt(); // 물건의 종류
        int sum = 0;

        for (int i = 0; i < pcs; i++) {
            int ea = sc.nextInt(); // 개별 물건의 가격
            int num = sc.nextInt(); // 개별 물건의 갯수
            sum += ea * num;
        }

        if(sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}