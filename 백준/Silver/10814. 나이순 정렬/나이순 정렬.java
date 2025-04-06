
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String [][]person = new String[N][2];
        /*
        nextInt()는 숫자만 읽고, 줄 바꿈 문자(\n)는 안 먹는다.
        -> 그래서 입력 버퍼에 \n이 남아 있다.
        -> 그 상태에서 바로 nextLine()을 쓰면 남아 있는 \n만 읽고 그냥 빈 문자열("") 리턴해버리는 문제 발생
        -> 그래서 실제로 데이터를 읽기 전에 버퍼를 한 번 비워줘야 한다.
         */
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String []line = sc.nextLine().split(" ");
            person[i][0] = line[0]; // 나이
            person[i][1] = line[1]; // 이름
        }

        /*
        new Comparator<String[]>() { ... }는 String[]를 비교하는 방식(= 정렬 기준)을 정의하는 객체로 이 안에 있는 compare() 메서드를 오버라이딩해서 비교 로직을 작성해준다.
        public int compare(String[] a, String[] b) 에서 정렬 중에 배열의 두 요소(a, b)를 받아서 어느 게 먼저 와야 할지 판단함 여기서 a[0]과 b[0]은 각각 "21", "20" 같은 나이 값임 → String 이므로 숫자로 비교하려면 Integer.parseInt(...)로 바꿔줘야 한다.
         */
        Arrays.sort(person, new Comparator<String[]>() {
            public int compare(String[] a, String[] b) {
                return Integer.parseInt(a[0]) - Integer.parseInt(b[0]); // 값이 양수 -> a가 앞에, 값이 0 -> 순서 유지, 값이 음수 -> a가 뒤에(b가 앞에)
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(person[i][0] + " " + person[i][1]);
        }
    }
}
