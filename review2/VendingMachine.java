import java.util.Scanner;

public class VendingMachine {

    static int i, TOTAL;


    static int[] NOTES = { 1000, 500, 100, 50, 10, 5, 2, 1 };


    static void notes(int value) {
        if (value / NOTES[i] != 0) {
            TOTAL += (value / NOTES[i]);
            System.out.println("Rs "+ NOTES[i] + " notes = " + value / NOTES[i]);
            value = value % NOTES[i];
        }
        i++;
        if (value == 0) {
            System.out.println("Total Number of Notes = " + TOTAL);
            return;
        }

        notes(value);

    }

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("enter amoumt");
            int value = s.nextInt();
            notes(value);
            s.close();
        } catch (Exception e) {
            System.out.println("enter value in integer");
        }
    }
}
