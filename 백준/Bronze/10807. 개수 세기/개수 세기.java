import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num  = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            int put = sc.nextInt();
            num[i] = put;
        }

        int v = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if(num[i] == v){
                count++;
            }
        }
        System.out.println(count);
    }
}