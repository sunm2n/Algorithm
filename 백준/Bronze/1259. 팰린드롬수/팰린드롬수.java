
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            String str = sc.next();

            if(str.equals("0")) {
                break;
            }

            int count = 0;
            for (int i = 0; i < str.length() / 2; i++) {
                if(str.charAt(i) == str.charAt(str.length() - i - 1)) {
                    count++;
                }
            }
            if(count == str.length() / 2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
