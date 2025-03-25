import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정수 N 입력 받기
        if(N % 2 == 1){ // N이 홀수일 경우 상근이가 무조건 이김
            System.out.println("SK"); 
        } else { // N이 짝수일 경우 창영이가 무조건 이김
            System.out.println("CY");
        }
    }
}