
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine(); // 찾고자 하는 문자열
        int N = sc.nextInt(); // 반지의 개수
        int count = 0;
        sc.nextLine(); // 개행처리

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            boolean found = false;

            for (int j = 0; j < s.length(); j++) {
                StringBuilder sb = new StringBuilder();

                for (int k = 0; k < str.length(); k++) {
                    char c = s.charAt((j + k) % s.length());
                    sb.append(c);
                }

                if(sb.toString().equals(str)) {
                    found =true;
                    break;
                }
            }
            if(found) count++;
        }

        System.out.println(count);
    }
}
