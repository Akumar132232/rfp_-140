import java.util.*;
public class VowelConsonant {


        public static void main(String[ ] arg)
        {
            int i=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a character : ");
            char ch=sc.next( ).charAt(0);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                System.out.println("Entered character "+ch+" is  Vowel");
            }

            else
                System.out.println("Entered character "+ch+" is Not an alphabet");
        }
    }
