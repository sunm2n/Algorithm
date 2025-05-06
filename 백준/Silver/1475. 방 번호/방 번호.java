
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String room_num = sc.nextLine();
        int []num_count = new int[10];

        for (int i = 0; i < room_num.length(); i++) {
           num_count[room_num.charAt(i) - '0']++;
        }

        int max_set = num_count[0];
        num_count[6] = Math.round((num_count[6] + num_count[9]) / 2.0f);

        for (int i = 1; i <= 8; i++) {
            if(num_count[i] > max_set) max_set = num_count[i];
        }

        System.out.println(max_set);
    }
}
