/*Maximum number b/w two numbers*/
//input 10 20 --->20 (since 20 is greater than 10)

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args)
    {
        int a,b;
        System.out.println("Enter first number");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        System.out.println("Enter second number");
        b=r.nextInt();
        if(a>b)
        {
            System.out.println("Greatest number is "+a);
        }
        else
        {
            System.out.println("Greatest number is "+b);
        }


    }
}
