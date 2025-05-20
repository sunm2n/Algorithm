
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        char []arr = new char[num.length()];

        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i);
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = num.length() - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}
