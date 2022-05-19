/*Vowel or Consonant in Java*/
//input a e i o u -----> vowel
//consonant b c etc...

import java.util.Scanner;

public class VowelCons
{
    public static void main(String[] args)
    {
        char ch;
        System.out.println("Enter any Character");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}

