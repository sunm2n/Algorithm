import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 점의 갯수

        int length = sc.nextInt();
        int height = sc.nextInt();
        int min_length = length;
        int max_length = length;
        int min_height  = height;
        int max_height = height;


        for (int i = 0; i < N-1; i++) {
             length = sc.nextInt(); // 가로 길이
             height = sc.nextInt(); // 세로 길이

            if(length > max_length){ // 가장 큰 가로 찾기
                max_length = length;
            } else if (length < min_length) { // 가장 작은 가로 찾기
                min_length = length;
            }

            if(height > max_height){ // 가장 큰 세로 찾기
                max_height = height;
            } else if (height < min_height) { // 가장 큰 세로 찾기
                min_height = height;
            }
        }

        System.out.println((max_length-min_length)*(max_height-min_height));
    }
}