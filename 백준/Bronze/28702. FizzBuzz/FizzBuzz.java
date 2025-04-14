/*
idea

어떤 연속된 세 수의 출력 결과 중에는 반드시 숫자가 하나 이상 포함되어야 한다.
세 개의 출력 결과가 모두 "Fizz", "Buzz", "FizzBuzz"일 수 없다.

찾은 숫자의 위치를 기반으로 다음에 올 숫자를 계산합니다.
예를 들어, 숫자가 첫 번째 입력이었다면 다음 숫자는 숫자 + 3
두 번째 입력이었다면 숫자 + 2
세 번째 입력이었다면 숫자 + 1
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String []input = new String[3];
        for (int i = 0; i < 3; i++) {
            input[i] = sc.nextLine().trim(); // .trim은 입력의 앞 두 공백을 삭제해줘서 입력 시 앞뒤 공백을 넣는 실수를 커버해 준다.
        }

        int nextNum = -1;

        // 숫자가 포함된 위치를 찾아서 그에 따라 nextNum을 계산한다.
        for (int i = 0; i < 3; i++) {
            if(isNumber(input[i])) {
                int num = Integer.parseInt(input[i]);
                nextNum = num + (3 - i);
                break;
            }
        }

        // FizzBuzz 규칙 적용
        if(nextNum % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (nextNum % 3 == 0) {
            System.out.println("Fizz");
        } else if (nextNum % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(nextNum);
        }
    }

    private static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
