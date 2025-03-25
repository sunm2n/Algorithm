
import java.util.Scanner;

/*
유클리드 호제법
2개의 자연수 a, b(a > b)에 대해서 a를 b로 나눈 나머지가 r일 때, a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
두 수 a와 b의 최소공배수는 a와 b의 곱을 a와 b의 최대공약수를 나눈 것과 같다.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 범위를 고려해서 int 가 아닌 long으로 선언
        long a = sc.nextInt();
        long b = sc.nextInt();
        long axb = a * b; 
        long temp = 0;

        if(a < b){  // 항상 a가 항상 더 큰 수가 되도록 설정
            temp = b;
            b = a;
            a = temp;
        }

        // 최대 공약수 구하기
        while(b != 0){ 
            temp = a % b;
            a = b;
            b = temp;
        }

        System.out.println(axb / a); // 두수의 곱을 최대 공약수로 나눠서 결과 출력
    }
}
