import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if (str.length() <= 1) {
            System.out.println(0);
            return;
        }

        int group0 = 0;
        int group1 = 0;

        if (str.charAt(0) == '0') {
            group0++;
        } else {
            group1++;
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                if (str.charAt(i) == '0') {
                    group0++;
                } else {
                    group1++;
                }
            }
        }

        System.out.println(Math.min(group0, group1));
    }
}
