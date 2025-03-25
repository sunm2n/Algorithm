import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next(); // 문자 입력 받기
        int[] num = new int[26]; // 알파벳 A-Z 숫자 자리 배열

        for (int i = 0; i < 26; i++) { // -1로 초기화
            num[i] = -1;
        }

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < S.length(); j++) {
                if((int)S.charAt(j) == 97+i){       // A부터 Z까지 문자열중에 가장 먼저 등장하는 자리수를 찾음
                    num[i] = j;                     // 문자열에서 등장 순서를 배열에 저장
                    break;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(num[i] + " ");
        }
    }
}