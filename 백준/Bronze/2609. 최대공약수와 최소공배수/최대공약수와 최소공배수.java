
/*
유클리드 호제법
 2개의 자연수 a, b(a > b)에 대해서 a를 b로 나눈 나머지가 r일 때, a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
 두 수 a와 b의 최소공배수는 a와 b의 곱을 a와 b의 최대공약수를 나눈 것과 같다.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N1xN2 = N1 * N2;
        int temp = 0;

        if(N1 < N2) { // N1이 항상 더 큰 수 가 되도록 만들기
            temp = N2;
            N2 = N1;
            N1 = temp;
        }

        // 최대 공약수 구하기
        while(N2 != 0){
            temp = N1 % N2;
            N1 = N2;
            N2 = temp;
        }

        System.out.println(N1); // 최대 공약수 추력
        System.out.println(N1xN2 / N1); // 최대 공배수 출력
    }
}
