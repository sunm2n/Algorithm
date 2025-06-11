
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int year = 2024;
        int month = 8;

        month += (N-1) * 7;
        year += month/ 12;
        month %= 12;

        if (month == 0) {
            month = 12;
            year -= 1;
        }

        System.out.println(year + " " + month);
    }
}
