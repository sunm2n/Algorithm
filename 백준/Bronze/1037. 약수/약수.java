
/*
문제 idea
가장 큰 약수 * 가장 작은 약수 = N
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 출력 조건에 "N은 항상 32비트 부호있는 정수로 표현할 수 있다." 있으므로 int 범위 벗어나는 경우는 고려 안해도 됨
        int N  = sc.nextInt();
        int num;
        int max = 0;
        int min = 1000000;

        for (int i = 0; i < N; i++) {
            num = sc.nextInt();
            if(min > num){
                min = num;
            }
            if(max < num){
                max = num;
            }
        }

        System.out.println(max * min);

    }
}
