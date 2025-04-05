
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int []grade = new int[T];
        String str;
        int num = 0;

        for (int i = 0; i < T; i++) {
            str = sc.next();
            for (int j = 0; j < str.length(); j++) {
               if (str.charAt(j) == 'O'){
                   num++;
                   grade[i] += num;
               } else {
                   num = 0;
               }
            }
            num = 0;
        }

        for (int i = 0; i < T; i++) {
            System.out.println(grade[i]);
        }
    }
}
