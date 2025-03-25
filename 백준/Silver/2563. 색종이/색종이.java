import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] paper = new int[100][100]; // 크기 100X100 짜리 배열 생성
        int count = 0; // 색칠해져 있을때마다 +1

        int turn = sc.nextInt();

        for (int i = 0; i < turn; i++) { // 색칠된 곳에 +1 하는 반복문
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    paper[a+j][b+k] += 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) { // 색칠된 곳이면 count에 +1
            for (int j = 0; j < 100; j++) {
                if(paper[i][j] != 0){
                    count++;
                }
            }
        }
        System.out.println(count); // 넓이 출력
    }
}