import java.util.Scanner;
import java.util.regex.*;
public class Main {

    public static void main(String[] args) {
        String firstName, lastName, email, password;
        String mobile;

        String fs1 = ("^[A-Z][A-Za-z]{3,7}$");//^[A-Z0-9.]{,50}$  \\b([A-Z]\\w*){3,7}$/\\b"
        String ls1 = ("^[A-Z][A-Za-z]{3,7}$");
        String es1 = ("(.+)@(.+){6}$");
        String ms1 = ("^\\d{10}$");
        String ps1 = ("^(?=.*[0-9])\"\n" + "+ \"(?=.*[a-z])(?=.*[A-Z])\"\n" + "+ \"(?=.*[@#$%^&+=])\"\n" + "+ \"(?=\\\\S+$).{8,20}$\"");


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        firstName = scanner1.nextLine();

        System.out.println("Enter your last name: ");
        lastName = scanner1.nextLine();

        System.out.println("Enter a valid email: ");
        email = scanner1.nextLine();

        System.out.println("Enter a valid mobile number: ");
        mobile = scanner1.nextLine();

        System.out.println("Enter a valid password: ");
        password = scanner1.nextLine();


        Boolean flag = true;

        if (firstName.matches(fs1)) {
            System.out.println("Valid");
        } else {
            System.out.println("first_Name_Not_valid");
            flag = false;

        }
        if (lastName.matches(ls1)) {
            System.out.println("Valid");
        } else {
            System.out.println("last_name_Not_valid");
            flag = false;

        }
        if (email.matches(es1)) {
            System.out.println("Valid");
        } else {
            System.out.println("Email_Not_valid");
            flag = false;

        }
        if (mobile.matches(ms1)) {
            System.out.println("Valid");
        } else {
            System.out.println("Phone_No_Not_valid");
            flag = false;
        }

        if (password.matches(ps1)) {
            System.out.println("Valid");
        } else {
            System.out.println("password_Not_valid");
            flag = false;
        }
        System.out.println("****************************************************************************************");
        System.out.println("FINAL OUTPUT");
        if (flag == true) {
            System.out.println("Correct");
        } else {
            System.out.println("Invalid_information");
        }
    }
}