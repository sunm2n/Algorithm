
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 개행 처리

        Set<String> wordSet = new HashSet<>(); // 중복을 제거하기 위해 HashSet<> 사용

        for (int i = 0; i < N; i++) {
            wordSet.add(sc.nextLine());
        }

        List<String> wordList = new ArrayList<>(wordSet); // HashSet에는 정렬 기능 X, ArrayList로 변환

        wordList.sort((a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length(); // 양수 일경우 a가 음수 일 경우 b가 먼저 옴
            } else {
                return a.compareTo(b); // 사전 순
            }
        });

        for (String word : wordList) {
            System.out.println(word);
        }
    }
}
