import java.util.*;
public class LeapYear {


        public static void main(String[] args) {

            // year to be checked
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter Year - ");
            int a= sc.nextInt();

            boolean leap = false;

            // if the year is divided by 4
            if (a % 4 == 0) {

                // if the year is century
                if (a % 100 == 0) {

                    // if year is divided by 400
                    // then it is a leap year
                    if (a % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }

                // if the year is not century
                else
                    leap = true;
            }

            else
                leap = false;

            if (leap)
                System.out.println(a + " is a leap year.");
            else
                System.out.println(a + " is not a leap year.");
        }
    }

