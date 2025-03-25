import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 1;
        int a = 2;

        if (K == 1){
            System.out.println("1");
            return;
        }

        while(true){
            if(N % a == 0){ // 나누어 떨어질 때마다 count++
                count++;
            }
            if(count == K && K != 1){ // count 와 K값이 같아지면 a출력
                System.out.println(a);
                break;
            }
            if(a == N){
                System.out.println("0");
                break;
            }
            a++;
        }
    }
}