import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str;
        String[] st = new String[num];

        for (int i = 0; i < num; i++) {
            str = sc.next();
            st[i] = str;
        }

        for (int i = 0; i < num; i++) {
            System.out.println(st[i].substring(0,1) + st[i].substring(st[i].length()-1));
        }

    }
}