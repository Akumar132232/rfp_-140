/*Print sum of Odd or Even in Given Range */
//Even=10(0+2+4+6+8+10=30)
//Odd=11(1+3+5+7+9+11=36)

import java.util.Scanner;
public class OddEvenSum {
    public static void main(String[] args)
    {
        int n,i,sum=0;
        System.out.println("Enter the range");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if(n%2==0)
        {
            for (i = 0; i <= n; i = i+2)
            {
                sum=sum+i;
            }
            System.out.print("Sum of Even Number "+sum);
        }
        else
        {
            for(i=1;i<=n;i=i+2)
            {
                sum=sum+i;
            }
            System.out.print("Sum of odd Number "+sum);
        }
    }
}
