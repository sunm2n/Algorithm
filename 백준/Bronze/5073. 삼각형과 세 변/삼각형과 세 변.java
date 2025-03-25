import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a == 0 && b == 0 && c == 0){ // 모두 0이 입력되면 프로그램 종료
                return;
            }

            if(a+b <= c || a+c <= b || b+c <= a){
                System.out.println("Invalid");
            } else if(a == b && b == c){
                System.out.println("Equilateral");
            } else if (a != b && a != c && b != c) {
                System.out.println("Scalene");
            } else {
                System.out.println("Isosceles");
            }
        }
    }
}