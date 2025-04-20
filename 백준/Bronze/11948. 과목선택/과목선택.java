
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int []grade = new int[6];

        for (int i = 0; i < 6; i++) {
            grade[i] = sc.nextInt();
        }

        int min = grade[0];
        for (int i = 1; i < 4; i++) {
            if(min > grade[i]) {
                min = grade[i];
            }
        }
        int sum = grade[0] + grade[1] + grade[2] + grade[3] - min; // 4과목중 가장 낮은거 제외

        sum += Math.max(grade[4], grade[5]); // 역사 지리중 높은거

        System.out.println(sum);
    }
}
