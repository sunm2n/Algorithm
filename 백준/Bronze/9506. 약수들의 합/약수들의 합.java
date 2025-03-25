import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int a = 1;
        int count = 0;
        int[] sum = new int[100];
        int total = 0;

        while(true){
            num = sc.nextInt();
            if(num == -1){
                return;
            }
            while(true){
                if(num < a){
                    break;
                }
                if(num % a == 0 && num != a){
                    sum[count] = a;
                    count++;
                }
                a++;
            }
            for (int i = 0; i < count; i++) {
                total += sum[i];
            }
            if(total == num){
                System.out.print(num+" = ");
                for (int i = 0; i < count-1; i++) {
                    System.out.print(sum[i]+" + ");
                }
                System.out.println(sum[count-1]);
            }else {
                System.out.println(num +" is NOT perfect.");
            }
            for (int i = 0; i < count; i++) {
                sum[i] = 0;
            }
            a = 1;
            count = 0;
            total = 0;
        }
    }
}