import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // N바이트
        int k = n/4;

        String x = "";
        String a = "int";
        String b = "long";
        String c = " ";

        for (int i = 0; i < k; i++) {
            x += (b + c);
        }

        System.out.println(x + a);
    }
}