
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for(char x : str.toCharArray()) {
            if(x >= 65 && x <= 90) {
                System.out.print(x);
            }
        }
    }
}
