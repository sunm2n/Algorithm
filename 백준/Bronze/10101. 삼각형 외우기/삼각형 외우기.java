import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a + b + c != 180){ // 합이 180도가 아닌 경우
            System.out.println("Error");
            return;
        } else if(a != b && a != c && b != c){ // 세 각이 다 다를 경우
            System.out.println("Scalene");
            return;
        } else if (a == b && b == c) { // 세 각이 모두 같을 경우
            System.out.println("Equilateral");
            return;
        } else if (a == b || b == c || a == c) { // 위의 경우를 제외하고 두 각이 같을 경우
            System.out.println("Isosceles");
        }
    }
}