import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 단어 갯수 입력 받기
        String[] str = new String[num];
        int[] check = new int[num]; // 단어가 다시 반복될 경우 +1 할 배열 선언
        int count = 0; // 겹치는 단어가 아닐 경우 count ++

        for (int i = 0; i < num; i++) {
            str[i] = sc.next(); // 단어 입력 받기
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                for (int k = j+1; k < str[i].length(); k++) {
                    if(str[i].charAt(j) == str[i].charAt(k) && str[i].charAt(j) != str[i].charAt(j+1) && k != j+1){ // 이웃한 단어가 달라질 때 이웃한 단어를 제외하고 뒤에 또 반복되는지 확인
                        check[i]++;
                    }
                }
            }
        }

        for (int i = 0; i < num; i++) {
            if(check[i] == 0){ // 반복되는 단어가 없을 경우 check[i] = 0 아닐 경우 0이 아니다
                count++;
            }
        }
        System.out.println(count);
    }
}