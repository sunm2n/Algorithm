
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 포켓몬의 개수
        int M = sc.nextInt(); // 맞춰야 하는 문제의 개수
        sc.nextLine(); // 개행 처리

        HashMap<String, Integer> nameToNumber = new HashMap<>(); // 이름 -> 숫자 찾기
        String []numberToName = new String[N + 1]; // 숫자 -> 이름 찾기

        // 포켓몬 이름 입력
        for (int i = 1; i <= N; i++) {
            String poketmon = sc.nextLine();
            nameToNumber.put(poketmon, i);
            numberToName[i] = poketmon;
        }

        StringBuilder sb = new StringBuilder();

        // 질의
        for (int i = 1; i <= M; i++) {
            String str = sc.nextLine();
            if(Character.isDigit(str.charAt(0))){
                sb.append(numberToName[Integer.parseInt(str)]).append("\n");
            } else{
                sb.append(nameToNumber.get(str)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
