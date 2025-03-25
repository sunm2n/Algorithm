import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int time = 0;

        for (int i = 0; i < str.length(); i++) {
            if((int)str.charAt(i) >= 65 && (int)str.charAt(i) <=67){
                time += 3;
            } else if ((int)str.charAt(i) >= 68 && (int)str.charAt(i) <=70) {
                time += 4;
            } else if ((int)str.charAt(i) >= 71 && (int)str.charAt(i) <= 73) {
                time += 5;
            } else if ((int)str.charAt(i) >= 74 && (int)str.charAt(i) <= 76) {
                time += 6;
            } else if ((int)str.charAt(i) >= 77 && (int)str.charAt(i) <= 79) {
                time += 7;
            } else if ((int)str.charAt(i) >= 80 && (int)str.charAt(i) <= 83) {
                time += 8;
            } else if ((int)str.charAt(i) >= 84 && (int)str.charAt(i) <= 86) {
                time += 9;
            } else {
                time += 10;
            }
        }
        System.out.println(time);
    }
}