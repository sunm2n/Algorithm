
/*
이 문제에서의 핵심 -> 계수 정렬

주어진 숫자의 개수를 세는 정렬 알고리즘

데이터의 크기가 제한적(예: 1~10,000)일 때 매우 효율적

정렬 대상 값을 배열 인덱스로 사용해서 등장 횟수를 카운트함

입력 처리: O(N)

출력 처리: O(N)

전체: O(N + K) (K: 수의 범위, ex. 1~10000)

💡 정렬 알고리즘 중 가장 빠른 축에 속하지만, 메모리를 많이 씀


사용하면 좋을 때
데이터 범위가 작고 (ex. 0~10000)

중복이 많아도 상관없고

부동소수점, 음수 없을 때 (응용해서 음수 처리도 가능하긴 함)
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력 속도를 위해 BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10001]; // 입력 값이 1부터 10000까지

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }

        for (int i = 1; i <= 10000; i++) {
            while (count[i] > 0) {
                bw.write(i + "\n");
                count[i]--;
            }
        }

        bw.flush(); // 출력
        bw.close();
        br.close();
    }
}

