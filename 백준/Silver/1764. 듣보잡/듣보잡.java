
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        Set<String> unheard = new HashSet<>();
        for (int i = 0; i < N; i++) {
            unheard.add(sc.nextLine());
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String str = sc.nextLine();
            if(unheard.contains(str)) {
                result.add(str);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        for (String str : result) {
            System.out.println(str);
        }
    }
}
