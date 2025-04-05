import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, temp;

        do {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if (c < a) {
              temp = a;
              a = b;
              b = temp;
            }
            if (c < b) {
                temp = b;
                b = c;
                c = temp;
            }
            if(a*a + b*b == c*c && a != 0 && b != 0 && c != 0) {
                System.out.println("right");
            }else if (a != 0 && b != 0 && c != 0){
                System.out.println("wrong");
            }

        } while (a != 0 || b != 0 || c != 0);
    }
}
