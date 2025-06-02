import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        HashMap<String, Integer> book = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = sc.nextLine();
            book.put(name, book.getOrDefault(name, 0) + 1);
        }

        String answer = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : book.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (value > max || (value == max && key.compareTo(answer) < 0)) {
                max = value;
                answer = key;
            }
        }

        System.out.println(answer);
    }
}
