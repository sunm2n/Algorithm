import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int num = sc.nextInt();

        System.out.println(a.charAt(num-1)); // a.charAt()는 1부터 시작이므로 -1 필요
    }
}