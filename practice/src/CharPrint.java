/*Print Character in Java*/
//input 10----->10
//input A------>A

import java.util.Scanner;

public class CharPrint {
    public static void main(String[] args)
    {
        char ch;
        System.out.println("Enter the chracter ");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);  //A
        System.out.println(ch);
    }
}
