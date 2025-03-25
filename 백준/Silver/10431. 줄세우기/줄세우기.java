import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt(); // 테스트 케이스의 경우의 수 입력받기
        int cm = 0; // 키(cm) 입력
        int count = 0; // 뒤로 물러서게 되는 경우의 수 카운트
        int[] person =new int[20]; // 20명을 넣을 배열

        for (int i = 0; i < P; i++) {
            
            int a = sc.nextInt(); // 테스트 케이스를 입력받을 변수
            
            for (int j = 0; j < 20; j++) { // 20명의 키 배열에 저장
                cm = sc.nextInt(); // 키 입력 받기
                person[j] = cm; // 입력받은 키 배열에 저장
            }
            
            for (int j = 0; j < 20; j++) { // 배열에 저장된 키를 비교하여 count 증가 시키기
                for (int k = 0; k < j; k++) {
                    if (person[k] > person[j]){ // 배열 뒷사람이 앞 사람보다 작은 경우 
                        count++; // count 증가
                    }
                }
            }
            System.out.println((i+1) + " " +count); 
            count = 0; // count 초기화
        }
    }
}