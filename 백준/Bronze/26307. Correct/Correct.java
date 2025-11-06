import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int HH = sc.nextInt();
        int MM = sc.nextInt();

        int submitTimeInMinutes = (HH * 60) + MM;

        int startTimeInMinutes = 9 * 60;

        int timeConsumed = submitTimeInMinutes - startTimeInMinutes;

        System.out.println(timeConsumed);
    }
}