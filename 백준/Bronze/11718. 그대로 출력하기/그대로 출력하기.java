
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        /*
        hasNextLine()은 boolean 형식으로 반환해주는 메소드이다. 
        다음 줄에 입력이 있는지의 여부를 판단하여 true / false를 반환한다. 
        개행문자(\n)도 동일하게 true로 반환하기 때문에 주의해야 한다.
         */
        
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            System.out.println(input);
        }

    }
}
