import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] result = sc.next().toCharArray();

        for (int i = 1; i < n; i++) {
            char[] next = sc.next().toCharArray();
            for (int j = 0; j < result.length; j++) {
                if(result[j] != next[j]){
                    result[j] = '?';
                }
            }
        }

        System.out.println(new String(result)); // String.valueOf(result)랑 똑같지만 좀 더 직관적임
    }
}
