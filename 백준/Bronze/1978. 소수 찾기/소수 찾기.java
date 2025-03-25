import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num;
        int count = 0; //소수의 개수 세기
        int a = 0; // 나누어 떨어지는게 있으면 +1
        for (int i = 0; i < N; i++) {
            num = sc.nextInt();
            if(num == 1){ // 1은 소수가 아니다
                continue;
            }
            for (int j = 2; j < num; j++) {
                if(num % j == 0){
                    a++;
                }
            }
            if(a == 0){ // 나누어 떨어지는게 없는 경우
                count++;
            }
            a = 0; // a 다시 초기화
        }
        System.out.println(count);
    }
}