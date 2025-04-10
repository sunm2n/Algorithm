
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int temp;
            
            if(a < b){
                temp = b;
                b = a;
                a = temp;
            }
            
            if(a < c){
                temp = c;
                c = a;
                a = temp;
            }
            
            String str;
            
            if(a * a == b * b + c * c) {
                str = "yes";
            } else {
                str = "no";
            }
            System.out.println("Scenario #" + (i + 1) + ":");
            System.out.println(str);
            System.out.println();
        }
    }
}
