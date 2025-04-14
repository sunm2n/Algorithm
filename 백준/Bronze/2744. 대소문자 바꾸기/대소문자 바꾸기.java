
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char []arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                arr[i] = Character.toLowerCase(str.charAt(i));
            } else {
                arr[i] = Character.toUpperCase(str.charAt(i));
            }
        }

        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            ans += arr[i];
        }

        System.out.println(ans);
    }
}
