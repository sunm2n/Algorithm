import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int num1_one = num1 % 10;   //num1의 1의 자리 수
        int num2_one = num2 % 10;   //num2의 1의 자리 수

        int re_num1 = num1 / 100 + (num1 % 100 - num1_one) + num1_one * 100;
        int re_num2 = num2 / 100 + (num2 % 100 - num2_one) + num2_one * 100;

        if(re_num1 > re_num2){
            System.out.println(re_num1);
        }else {
            System.out.println(re_num2);
        }
    }
}