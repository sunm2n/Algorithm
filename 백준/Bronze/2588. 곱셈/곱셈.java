import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a*b;


        ArrayList<Integer> arrNum = new ArrayList<>();
        while (b > 0) {
            arrNum.add(b %10);
            b /= 10;
        }

        System.out.println(arrNum.get(0) *a);
        System.out.println(arrNum.get(1) *a);
        System.out.println(arrNum.get(2) *a);
        System.out.println(c);
    }
}