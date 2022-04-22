package bridgelabz;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random rand= new Random();
        int number=rand.nextInt(10);
        System.out.println(number);
        if(number>=5){
            System.out.println("absent");
        }else{
            System.out.println("Enter 0 for full time 1 for part time");
            int num=scanner.nextInt();
            int workingHours;
            int total;
            switch (num) {
                case 0:
                     workingHours = 8;
                    System.out.println("enter the days");
                     int day1=scanner.nextInt();
                     int total_for_day=workingHours*day1;
                    System.out.println(total_for_day);
                    System.out.println(total_for_day*20);
                    break;
                case 1:
                     workingHours=16;
                    System.out.println("enter the day2");
                     int day2=scanner.nextInt();
                     int total_hour=workingHours*day2;
                     if(day2>20)
                     {
                         if(total_hour<100){
                             total=total_hour*20;
                             //System.out.println(total);
                         }else{
                             total=100*20;
                         }
                     }else{
                         if(total_hour<100) {
                             total = total_hour * 20;
                         }else{
                             total=100*20;
                         }
                     }
                    System.out.println(total);
                    break;
                default:
                    workingHours = 8;
                    break;
            }





            }
        }


    }