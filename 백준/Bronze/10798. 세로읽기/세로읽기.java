import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        String []a = new String[5]; // 처음에 문자열을 저장할 배열
        int max = 0;
        for (int i = 0; i < 5; i++) {
            str = sc.nextLine();
            a[i] = str;
            if(max < str.length()){
                max = str.length(); // 2차원 배열의 크기를 정하기 위해
            }
        }

        char [][]b = new char[5][max]; // 2차원 배열 선언

        for (int i = 0; i < 5; i++) { // 배열에 단어 집어넣기
            for (int j = 0; j < max; j++) {
                if(a[i].length() - 1 < j){
                    b[i][j] = 0; // 문자열의 길이가 max 보다 작을 경우 배열 범위 벗어나는거 방지
                }else {
                    b[i][j] = a[i].charAt(j); 
                }
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (b[j][i] == 0) { // 배열이 빈칸일 경우 출력 X
                    System.out.print("");;
                } else {
                    System.out.print(b[j][i]); // 단어 세로로 출력하기
                }
            }
        }
    }
}