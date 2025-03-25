import java.util.*;
import java.io.*;

public class Main {
    public static int N;
    public static  long[] arr;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new long[N+1];
        arr[0] = 1;
        arr[1] = 1;

        if(N == 1){
            System.out.println("4");
        } else if (N == 2) {
            System.out.println("6");
        } else if (N == 3){
            System.out.println("10");
        } else {
            for (int i = 2; i < N+1; i++) {
                arr[i] = arr[i-1] + arr[i-2];
            }
            long ans = (arr[N-1] + arr[N-2]) * 2 + (arr[N-2] + arr[N-3]) * 2;
            System.out.println(ans);
        }
    }
}