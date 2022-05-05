import java.util.*;
public class Distance {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x1, x2 = 0, y1, y2 = 0;
        int a, b;
        float distance;
        System.out.println("Enter x1 : ");
        x1=scan.nextInt();
        System.out.println("Enter y1 : ");
        y1=scan.nextInt();

        a=(x2-x1);
        b=(y2-y1);
        System.out.println(Math.sqrt(a*a + b*b));

    }
}