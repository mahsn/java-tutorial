package emailapp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private  String alternateEmail;

    //Constructor to receive the first name and the last name

    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName  = lastName;
    }
    public Email() {

    }
    /**
     * Ask for the department
     * */
    protected int selectDepartment(int depChoice) {
        switch (depChoice) {
            case 0:
                System.out.println("The department is selected " + this.defineDepartment(depChoice));
            break;
            case 1:
                System.out.println("The department is selected " + this.defineDepartment(depChoice));
            break;
            case 2:
                System.out.println("The department is selected " + this.defineDepartment(depChoice));
            break;
            default:
                System.out.println("The department is selected " + this.defineDepartment(depChoice));
        }
        return depChoice;
    }

    /**
     * Select Department
     * @param departmentIndex
     * @return String | null
     * */
    private String defineDepartment(int departmentIndex) {
        String arr[] = {"Sales", "Development", "Accounting"};
        for (int i=0; i < arr.length; i++) {
            if (i == departmentIndex) {
                this.setDepartment(arr[i]);
                return arr[i];
            }
        }
        return null;
    }

    /**
     * Generate a random password for email account
     * @param  passLength
     * @return String
     * */
    public String generatePassword(int passLength) {
        String pass = this.randomPassword(passLength);
        return  pass;
    }

    /**
     * Generate a random password
     *
     * */
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPRQSTUWVXYZ123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // Set the mailbox capacity

    // Set the altername email
    public String generateEmail()
    {
        return this.getFirstName().toLowerCase() +
                "." + this.getLastName().toLowerCase() +
                "@" + this.getDepartment().toLowerCase() + ".com";
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

}
