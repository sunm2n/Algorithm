import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        String reverse = "";
        for (int i = st.length()-1; i >= 0 ; i--) {
            reverse += st.charAt(i);
        }

        if(st.equals(reverse)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}