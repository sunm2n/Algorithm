
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int i = 1;
        final double EPS = 1e-9;
        /*
        val 값이 실제로는 거의 0인데 부동소수점 오차로 인해 음수가 될 수 있다.
        따라서 var < 0에서 문제가 생길 수 있음
        오차 허용치(epsilon) EPS를 설정해서 비교
         */

        while(true) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            if(a == 0 && b == 0 && c ==0) {
                break;
            }

            double ans = 0;
            char abc = 0;
            boolean isImpossible = false;

            if(a == -1){
                double val = c * c - b * b;
                if (val < EPS) {
                    isImpossible = true;
                } else {
                    ans = Math.sqrt(val);
                    abc = 'a';
                }
            } else if(b == -1){
                double val = c * c - a * a;
                if(val < EPS) {
                    isImpossible = true;
                } else {
                    ans = Math.sqrt(val);
                    abc = 'b';
                }
            } else if(c == -1){
                ans = Math.sqrt(a * a + b * b);
                abc = 'c';
            }

            System.out.println("Triangle #" + i);
            if (isImpossible) {
                System.out.println("Impossible.");
            } else {
                System.out.printf("%c = %.3f\n", abc, ans);
            }
            System.out.println();
            i++;
        }
    }
}
