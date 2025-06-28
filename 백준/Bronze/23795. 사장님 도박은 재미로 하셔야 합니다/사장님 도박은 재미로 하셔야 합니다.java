import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        
        while (true) {
            int num = sc.nextInt();
            
            if (num == -1) break;
            
            sum += num;
        }

        System.out.println(sum);
    }
}