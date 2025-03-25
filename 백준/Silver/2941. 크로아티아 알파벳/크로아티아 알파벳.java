import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String croa = sc.nextLine();
        int count = croa.length();

        for (int i = 0; i < croa.length()-1; i++) {
            if(croa.charAt(i) == 'c'&& croa.charAt(i+1) == '='){count --;}
            else if(croa.charAt(i) == 'c'&& croa.charAt(i+1) == '-'){count --;}
            else if(croa.charAt(i) == 'd'&& croa.charAt(i+1) == '-'){count --;}
            else if(croa.charAt(i) == 'l'&& croa.charAt(i+1) == 'j'){count --;}
            else if(croa.charAt(i) == 'n'&& croa.charAt(i+1) == 'j'){count --;}
            else if(croa.charAt(i) == 's'&& croa.charAt(i+1) == '='){count --;}
            else if(croa.charAt(i) == 'z'&& croa.charAt(i+1) == '='){count --;}
        }
        for (int i = 0; i < croa.length()-2; i++) {
            if(croa.charAt(i) == 'd'&& croa.charAt(i+1) == 'z' && croa.charAt(i+2) == '='){count --;}
        }
        System.out.println(count);
    }
}