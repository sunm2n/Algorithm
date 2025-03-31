
import java.util.Scanner;

/*
선분 교차 확인 방법 => CCW 사용
CCW(p1,p2,p3)XCCW(p1,p2,p4)<=0 && CCW(P3,P4,P1)XCCW(P3,P4,P2)<=0 조건 만족
추가적으로 모든 선분이 일직선 상에 존재할 경우도 생각해야 하므로
CCW(p1,p2,p3)XCCW(p1,p2,p4) = 0 && CCW(p1,p2,p3)XCCW(p1,p2,p3) = 0 일때 두 선분이 포개어져 있는지 확인해야 한다.
단 문제에서는 선분이 일직선 상일 경우는 생각하지 않는다고 했으므로 생각하지 않는다.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int ans = 0;
        int temp;

        // CCW(p1,p2,p3)XCCW(p1,p2,p4)<=0 && CCW(P3,P4,P1)XCCW(P3,P4,P2)<=0
        if (ccw(x1,x2,x3,y1,y2,y3) * ccw(x1,x2,x4,y1,y2,y4) <= 0 && ccw(x3,x4,x1,y3,y4,y1) * ccw(x3,x4,x2,y3,y4,y2) <= 0) {
            ans = 1;
        }

        System.out.println(ans);

    }

    public static int ccw(long x1, long x2, long x3, long y1, long y2, long y3) { // 외적 계산에서 long으로 형변환한 이유는 오버플로우 방지를 위해서
        return (x1 * y2 + x2 * y3 + x3 * y1 - x2 * y1 - x3 * y2 - x1 * y3) > 0 ? 1 : -1;
    }
}
