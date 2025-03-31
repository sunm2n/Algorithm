
/*
필요한 수학적 개념들
a^n+m = a^n * a^m
(a * b) mode c = ( a mod c * b mod c) mod c
=> (a * b) % c = (a % c * b % c ) mod c

idea
a^8
=a^4 * a^4
=((a^2*a^2) * (a^2*a^2))
=((a^1*a^1) * (a^1*a^1)) * ((a^1*a^1) * (a^1*a^1))

만약 지수가 홀수라면 a^4*a^4*a 이런 식으로 표현하면 된다.
a^9
=a^4 * a^4 * a
=((a^2*a^2) * (a^2*a^2)) * a
=((a^1*a^1) * (a^1*a^1)) * ((a^1*a^1) * (a^1*a^1)) * a
 */

import java.util.Scanner;

public class Main {

    public static long C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextInt();
        long B = sc.nextInt();
        C = sc.nextInt();

        System.out.println(pow(A,B));
    }

    public static long pow(long A , long B){
        if (B == 1){
            return A % C;
        }

        long temp = pow(A, B / 2);

        if (B % 2 == 1){
            return (temp % C * temp % C) * A % C; // return temp * temp * A % C; 로 코드를 만들면 long 형의 범위를 넘기는 경우가 발생한다.
        }

        return temp * temp % C;
    }
}
