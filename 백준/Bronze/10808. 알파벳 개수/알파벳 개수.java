
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        int []num = new int[26];

        for (int i = 0; i < 26; i++) {
            num[i] = 0;
        }

        for (int i = 0; i < str.length(); i++) {
            num[str.charAt(i) - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
