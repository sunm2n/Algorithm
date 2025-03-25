import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 2;
        while(true){
            if(N%num == 0){
                N /= num;
                System.out.println(num);
                num = 2;
            }else {
                num++;
            }
            if(N == 1){
                break;
            }
        }
    }
}