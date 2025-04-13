import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 참가자 수
        int []size = new int[6];
        for (int i = 0; i < 6; i++) {
            size[i] = sc.nextInt();
        }

        int T = sc.nextInt(); // 티셔츠의 묶음 수
        int P = sc.nextInt(); // 펜의 묶음 수

        int Tcount = 0;
        for (int i = 0; i < 6; i++) {
            Tcount += (size[i] + T -1) /T; // 올림 계산
        }

        int p1 = N / P;
        int p2 = N % P;

        System.out.println(Tcount);
        System.out.println(p1 + " " + p2);
    }
}
