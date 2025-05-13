import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            // 각 문장의 알파벳 등장 횟수를 카운트 함
            int []alphabet1 = new int[26];
            int []alphabet2 = new int[26];

            String str1 = sc.next().toLowerCase();
            String str2 = sc.next().toLowerCase();

            // 첫번째 문장 알파벳 등장 횟수
            for (int j = 0; j < str1.length(); j++) {
                alphabet1[str1.charAt(j) - 'a']++;
            }
            // 두번째 문장 알파벳 등장 횟수
            for (int j = 0; j < str2.length(); j++) {
                alphabet2[str2.charAt(j) - 'a']++;
            }

            boolean check = true;
            for (int j = 0; j < 26; j++) {
                if(alphabet1[j] != alphabet2[j]) {
                    check = false;
                    break;
                }
            }
            if(check) {
                System.out.println(str1 + " & " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " & " + str2 + " are NOT anagrams.");
            }
        }
    }
}

