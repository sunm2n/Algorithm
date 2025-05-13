
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String find = sc.nextLine();

        int count = 0;
        int index = 0;

        while (index <= text.length() - find.length()) {
            int found = text.indexOf(find, index);
            if (found == -1) {
                break;
            } else {
                count++;
                index = found + find.length();
            }
        }

        System.out.println(count);
    }
}
