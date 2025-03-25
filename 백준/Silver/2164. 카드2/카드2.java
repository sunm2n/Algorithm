
import java.util.Queue;
import java.util.LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        while(q.size() > 1){
            q.poll(); // 맨 앞의 원소 버리기
            q.offer(q.poll()); // 맨 앞의 원소가 빠진 후 두 번째 원소를 맨 뒤로 보내기
        }
        System.out.println(q.poll());
    }
}
