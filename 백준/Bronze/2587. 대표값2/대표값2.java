import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        int temp;
        int[] arr = new int[5];


        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();
            arr[i] = num;
        }

        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        sum = sum / 5;

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(sum);
        System.out.println(arr[2]);
    }
}