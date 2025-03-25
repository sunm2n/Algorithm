import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1;
        if(str.equals(" ")){
            count = 0;
        }else {
            for (int i = 1; i < str.length()-1 ; i++) {
                if(str.charAt(i) == ' '){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}