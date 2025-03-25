import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        if(a1 == b1){
            System.out.print(c1 + " ");
        } else if(a1 == c1){
            System.out.print(b1 + " ");
        } else if (b1 == c1) {
            System.out.print(a1 + " ");
        }

        if(a2 == b2){
            System.out.print(c2);
        } else if (a2 == c2) {
            System.out.print(b2);
        } else if (b2 == c2) {
            System.out.print(a2);
        }

    }
}