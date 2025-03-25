import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num;
        int[] arr = new int[N];
        int temp;

        for (int i = 0; i < N; i++) {
            num = sc.nextInt();
            arr[i] = num;
        }

        for (int i = 1; i < N; i++) { // 버블 정렬 사용
            for (int j = 1; j < N; j++) {
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}