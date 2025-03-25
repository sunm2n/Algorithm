import java.util.Scanner;

public class Main {
    
    public static int[] arr = new int[1000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i < arr.length ; i++) { // 배열을 -1로 초기화
            arr[i] = -1;
        }
        System.out.println(num(N));
    }
    
    public static int num(int N){
        if(arr[N] == -1){
            arr[N] = (num(N-1) + num(N-2)) % 15746;
        }
        return arr[N];
    }
}