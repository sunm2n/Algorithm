
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int switch_count = sc.nextInt(); // 스위치의 개수 입력받기
        boolean [] arr = new boolean[switch_count];

        int num;
        for (int i = 0; i < switch_count; i++) { // 스위치 0 과 1 입력받기
            num = sc.nextInt();
            if (num == 1){
                arr[i] = true; // 1을 입력받으면 true 저장
            } else {
                arr[i] = false; // 0을 입력받으면 false 저장
            }
        }

        int n = sc.nextInt(); // 학생들 수 입력받기
        int gender; // 성별 선언
        int switch_number; // 정수 선언
        int a; // while 문 사용
        for (int i = 0; i < n; i++) {
            gender = sc.nextInt();
            switch_number = sc.nextInt();
            a = 1;

            if (gender == 1){ // 남자일 경우
                for (int j = 0; j < switch_count; j++) {
                    if ((j + 1) % switch_number == 0){ // 입력받은 수의 배수 찾기 이때 스위치 번호는 1부터 시작이므로 J+1을 해준다.
                        arr[j] = !arr[j]; // boolean값 변환
                    }
                }
            } else { // 여자일 경우
                switch_number = switch_number - 1; // 스위치 넘버는 1부터 시작이므로 배열 위치 보다 한칸 앞에 있는 것을 조정
                arr[switch_number] = !arr[switch_number];
                while ((switch_number - a) >= 0 && (switch_number + a) < switch_count){
                    if (arr[switch_number - a] == arr[switch_number + a]){ // 좌우 대칭일 경우
                        arr[switch_number - a] = !arr[switch_number - a]; // boolean 값 변환
                        arr[switch_number + a] = !arr[switch_number + a];
                        a++;
                    } else { // 좌우 대칭이 아닐 경우
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < switch_count; i++) { // 결과 출력
            System.out.print(arr[i] ? "1 " : "0 ");
            if((i + 1) % 20 == 0){
                System.out.println(); // 20번째 마다 줄바꿈
            }
        }
    }
}
