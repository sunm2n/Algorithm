import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int p = 0;
        if(N % 5 == 0){ // 5로 나누어 떨어질 때
            System.out.println(N / 5);
        }else {
            while (N > 0) { // 5로 나눈어 떨어지지 않을 때
                N -= 3; // 3을 최소한으로 쓰기 위한 장치
                p += 1; // 봉지의 개수
                if (N % 5 == 0) { // 3을 빼고 5로 나누어 질 때
                    p += N / 5;
                    System.out.println(p);
                    break;
                } else if (N == 1 || N == 2) { // 3을 뺐더니 3보다 작아져서 나누어 떨어지지 않을 경우
                    System.out.println("-1");
                    break;
                } else if(N == 0){ // N이 3으로만 나누어 떨어질 경우
                    System.out.println(p);
                    break;
                }
            }
        }
    }
}