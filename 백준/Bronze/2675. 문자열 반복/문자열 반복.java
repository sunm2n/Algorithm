import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rope_num; 
        String rope_str;
        int[] arr_num = new int[num];
        String[] arr_str = new String[num];

        for (int i = 0; i < num; i++) {
            rope_num = sc.nextInt();        // 문자열 반복횟수 입력받기
            rope_str = sc.next();           // 문자열 입력 받기
            arr_num[i] = rope_num;          // 문자열 반복횟수 저장
            arr_str[i] = rope_str;          // 문자열 저장
        }

        for (int i = 0; i < num; i++) {                         // 반복 횟수 num 받은 만큼 돌리기
            for (int j = 0; j < arr_str[i].length(); j++) {     // 문자열의 각 문자 출력
                for (int k = 0; k < arr_num[i]; k++) {          // 각 문자를 반복횟수 받은 만큼 출력
                    System.out.print(arr_str[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}