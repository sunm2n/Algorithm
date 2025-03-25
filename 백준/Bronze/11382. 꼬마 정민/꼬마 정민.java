import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String[]achange = a.split(" ");

        long sum = Long.parseLong(achange[0]) + Long.parseLong(achange[1]) + Long.parseLong(achange[2]);

        System.out.println(sum);
    }
}