import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 카드의 갯수
        int M = sc.nextInt(); // 조건 M
        int sum = 0;

        int[] num = new int[count];
        for (int i = 0; i < count; i++) {
            num[i] = sc.nextInt(); // 입력받은 수 배열에 저장
        }

        for (int i = 0; i < count; i++) {
            for (int j = i+1; j < count; j++) {
                for (int k = j+1; k < count; k++) {
                    if(num[i] + num[j] + num[k] > sum && num[i] + num[j] + num[k] <= M){ // 세 수의 합이 기존 합보다 크면서 500을 넘지 않아야함
                        sum = num[i] + num[j] + num[k];
                    }
                }
            }
        }
        System.out.println(sum); // 결과 출력
    }
}