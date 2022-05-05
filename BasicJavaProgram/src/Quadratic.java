import java.util.*;
public class Quadratic {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, D, X1, X2;

        System.out.println("Enter a : ");
        a=scan.nextDouble();
        System.out.println("Enter b : ");
        b=scan.nextDouble();
        System.out.println("Enter c : ");
        c=scan.nextDouble();
        System.out.println("Quadratic Equation is : "+a+"x*X"+b+"x"+c);
        D=(b*b-4*a*c);
        System.out.println("D= "+D);
        X1 = ((-b+(Math.sqrt(D)))/(2*a));
        X2 = ((-b-(Math.sqrt(D)))/(2*a));
        System.out.println("First root of the Equation is : "+X1);
        System.out.println("Second root of the Equation is : "+X2);
    }
}