import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        if(grade/10 >=9 ){
            System.out.println("A");
        } else if (grade/10 >=8) {
            System.out.println("B");
        } else if (grade/10 >=7) {
            System.out.println("C");
        } else if (grade/10 >=6) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}