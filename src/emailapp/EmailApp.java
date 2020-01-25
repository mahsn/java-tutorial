package emailapp;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        Email email = new Email();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        email.setFirstName(scanner.nextLine());
        System.out.println("Lastname:");
        email.setLastName(scanner.nextLine());
        System.out.print("Departments\n0 for Sales\n1 Development\n2 Accounting");
        System.out.println("Enter department code:" + email.selectDepartment(scanner.nextInt()));
        scanner.nextLine();
        System.out.println("Enter pass Lenght: "  +   email.generatePassword(scanner.nextInt()));
        System.out.println("Email:" + email.generateEmail());
    }
}
