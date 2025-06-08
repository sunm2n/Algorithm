
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count_person = 0;
        int max_person = 0;

        for (int i = 0; i < 4; i++) {
            count_person -= sc.nextInt();
            count_person += sc.nextInt();
            max_person = Math.max(count_person, max_person);
        }

        System.out.println(max_person);
    }
}
