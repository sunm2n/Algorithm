
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        if(c == 'M') {
            System.out.println("MatKor");
        } else if (c == 'W') {
            System.out.println("WiCys");
        } else if (c == 'C') {
            System.out.println("CyKor");
        } else if (c == 'A') {
            System.out.println("AlKor");
        } else {
            System.out.println("$clear");
        }
    }
}
