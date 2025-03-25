import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eng = sc.nextLine();
        eng = eng.toUpperCase(); // 입력받은 문자열을 모두 대문자로 변환
        int[] count = new int[26];
        char ch;
        int num;
        int max =0;
        int order = 0;

        for (int i = 0; i < eng.length(); i++) {
            ch = eng.charAt(i);
            num = (int)ch;
            count[num-65]++;
        }

        for (int i = 0; i < 26; i++) {
            if(count[i] > max){
                max = count[i];
                order = i + 65;
            }
        }

        Arrays.sort(count); // 가장 큰 수 2개를 제일 오른쪽으로 밀기 위해

        if(count[24] == count[25]){
            System.out.println("?");
        } else {
            System.out.println((char)order);
        }

    }
}