
public class Main {
    public static void main(String[] args) {

        boolean[] isGenerated = new boolean[10001];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10000 ; i++) {
            int n = d(i);
            if(n <= 10000) {
                isGenerated[n] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if(!isGenerated[i]) {
                sb.append(i).append("\n"); // sb.append(i + "\n");이렇게도 가능하지만 + 연산자는 내부적으로 임시 문자열을 생성하기 때문에 상대적으로 느리다.
            }
        }
        System.out.println(sb);
    }

    public static int d(int n) {
        int sum = n;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
