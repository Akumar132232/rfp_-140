package bridgelabz;

import java.util.Scanner;
import java.lang.Math.*;

public class math {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter x1");
        int x1=scanner.nextInt();
        System.out.println("enter y1");
        int y1=scanner.nextInt();
        System.out.println("enter x2");
        int x2=scanner.nextInt();
        System.out.println("enter y2");
        int y2=scanner.nextInt();
        System.out.println("enter x3");
        int x3=scanner.nextInt();
        System.out.println("enter y3");
        int y3=scanner.nextInt();
        System.out.println("enter x4");
        int x4=scanner.nextInt();
        System.out.println("enter y4");
        int y4=scanner.nextInt();

        Double length_first= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println(length_first);

        Double length_second= Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
        System.out.println(length_second);

        Double obj1= length_first;
        Double obj2= length_second;

        System.out.println(obj1.equals(obj2));

        System.out.println(obj1.compareTo(obj2));

        }



    }

