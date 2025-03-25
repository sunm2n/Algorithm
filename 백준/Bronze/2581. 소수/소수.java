import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // M 이상
        int N = sc.nextInt(); // N 이하
        int sum = 0; // 합 저장 변수
        int min = 10000; // 최소값 저장 변수, M과 N은 모두 10000이하
        int count = 0;


        for (int i = M; i <= N; i++) {
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    count = 0;
                    break;
                } else {
                    count++;
                }
                if(count == i-2){ // 나누어 떨어지는게 하나도 없는 경우
                    sum += i;
                }
                if(count == i-2 && min>i){ // 나누어 떨어지는게 하나도 없고 제일 작은 값
                    min = i;
                }
            }
        }
        if(M <=2 && N >=2){ // 2가 M과 N 사이에 포함될 경우 예외처리
            sum +=2;
            min = 2;
        }
        
        if(sum != 0){
            System.out.println(sum);
            System.out.println(min);
        }else { // 소수가 없을 경우 -1 출력
            System.out.println("-1");
        }
    }
}