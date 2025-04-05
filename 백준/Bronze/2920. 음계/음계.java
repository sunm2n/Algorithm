import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[8];
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            if (arr[i] == i + 1){
                count1++;
            } else {
                break;
            }
        }
        for (int i = 7; i >= 0; i--) {
            if(arr[7-i] == i + 1){
                count2++;
            } else {
                break;
            }
        }
        if(count1 == 8){
            System.out.println("ascending");
        } else if (count2 == 8) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
