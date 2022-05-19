import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        int a, b,sum;
        System.out.println("Enter the value for a : ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        System.out.println("Enter the value for a : ");
        b=r.nextInt(); //we can use only one object r for the scanner method
        sum = a+b;
        System.out.println("sum =" + sum);

    }
}
