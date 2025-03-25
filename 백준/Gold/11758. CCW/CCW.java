/*
ccw 공식
신발끈 공식을 써서
>0 이면 반시계 방향
=0 이면 일직선
<0 이면 시계방향
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []X = new int[3];
        int []Y = new int[3];

        for (int i = 0; i < 3; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        int ans = (X[0]*Y[1] + X[1]*Y[2] + X[2]*Y[0]) - (X[1]*Y[0] + X[2]*Y[1] + X[0]*Y[2]);

        if(ans == 0){
            System.out.println("0");
        } else if (ans < 0) {
            System.out.println("-1");
        } else {
            System.out.println("1");
        }
    }
}
