import java.util.Scanner;

public class oddEven
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter any number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if(n%2==0)
        {
            System.out.println("Even NUmber");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
}
