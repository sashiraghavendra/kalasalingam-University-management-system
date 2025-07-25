import java.util.Scanner;
import java.util.Random;

public class Kalasalingam {

    static long s_bal = 125000;

    static class Student {
        String name;
        String fath_name;
        String num;
        int course;
        char gender;
    }

    static class Fees {
        int ch;
        long creg;
        long total, pay;
        long paid;
    }

    static class Hostel {
        int ch, mess, type;
        long creg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        long reg = rand.nextInt(20229999 - 20221000 + 1) + 20221000;

        System.out.println("Welcome to KALASALINGAM UNIVERSITY");
        System.out.println("Select an option to proceed!");

        while (true) {
            System.out.println("\n\n1. Apply for B.Tech Online\n2. Pay Semester Fees\n3. Pay Hostel fees\n4. Exit(press 0)");
            int ch = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (ch) {
                case 1:
                    apply(sc);
                    System.out.println("\nYour admission number is " + reg);
                    break;
                case 2:
                    fees(sc, reg);
                    break;
                case 3:
                    hfees(sc, reg);
                    break;
                case 0:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid input.");
            }
        }
    }

    public static void apply(Scanner sc) {
        Student s = new Student();
        System.out.println("Select a course to apply: ");
        System.out.println("1. B.Tech Computer Science and Engineering\n2. B.Tech Electronics and Communication Engineering\n3. B.Tech Information Technology\n4. B.Tech Electrical and Electronics Engineering\n5. B.Tech Mechanical Engineering\n6. B.Tech Civil Engineering\n7. B.Tech Bio Technology\n8. B.Tech Food Technology");
        s.course = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter your name(in block letters): ");
        s.name = sc.nextLine();

        System.out.print("Enter your gender(M/F): ");
        s.gender = sc.next().charAt(0);
        sc.nextLine(); // consume newline

        System.out.print("Enter your father name: ");
        s.fath_name = sc.nextLine();

        System.out.print("Enter your mobile number: ");
        s.num = sc.next();

        System.out.println("You have successfully registered.");
        System.out.println("\n\t\t\t\t\tSTUDENT DETAILS");
        System.out.println("Name: " + s.name);

        if (s.gender == 'm' || s.gender == 'M')
            System.out.println("Gender: Male");
        else
            System.out.println("Gender: Female");

        System.out.println("Father Name: " + s.fath_name);
        System.out.println("Mobile Number: " + s.num);

        System.out.print("Course: ");
        switch (s.course) {
            case 1:
                System.out.println("Computer Science and Engineering");
                break;
            case 2:
                System.out.println("Electronics and Communication Engineering");
                break;
            case 3:
                System.out.println("Information Technology");
                break;
            case 4:
                System.out.println("Electrical and Electronics Engineering");
                break;
            case 5:
                System.out.println("Mechanical Engineering");
                break;
            case 6:
                System.out.println("Civil Engineering");
                break;
            case 7:
                System.out.println("Bio Technology");
                break;
            case 8:
                System.out.println("Food Technology");
                break;
            default:
                System.out.println("Invalid Course Selected");
        }
    }

    public static void fees(Scanner sc, long reg) {
        Fees f = new Fees();
        f.paid = 0;
        f.total = 125000;

        System.out.print("Enter your reg number to pay fees: ");
        f.creg = sc.nextLong();

        if (f.creg == reg) {
            System.out.println("\n\t\t Semester Fee Payment");
            System.out.println("Total Fees    : " + f.total);
            System.out.println("Balance       : " + s_bal);
            System.out.print("Enter the amount to pay: ");
            f.pay = sc.nextLong();

            if (f.pay <= s_bal) {
                f.paid += f.pay;
                s_bal -= f.paid;
                System.out.println("Your new fee balance is " + s_bal);
                System.out.println("Fee paid successfully.\n");
            } else {
                System.out.println("Entered amount is more than balance. Can't proceed to payment");
            }
        } else {
            System.out.println("Invalid register number.");
        }
    }

    public static void hfees(Scanner sc, long reg) {
        Hostel h = new Hostel();
        System.out.print("Enter your registration no: ");
        h.creg = sc.nextLong();

        if (h.creg == reg) {
            System.out.println("\nSelect a hostel to book:");
            System.out.println("1. Annexure 5 shared - 59,500\n2. Non attached 4 shared - 64,500\n3. Attached 4 shared - 74,500\n4. AC Non attached 4 shared - 83,500\n5. AC attached - 97,500");
            h.ch = sc.nextInt();

            System.out.println("Select your type of mess: \n1. South Indian\n2. North Indian");
            h.mess = sc.nextInt();

            System.out.println("Select your type of diet: \n1. Vegetarian\n2. Non-Vegetarian");
            h.type = sc.nextInt();

            System.out.println("\nHostel booked successfully.");
            System.out.println("\n\t\t\tHostel Details");
            System.out.println("Register number: " + reg);

            System.out.print("Hostel type: ");
            switch (h.ch) {
                case 1:
                    System.out.println("Annexure 5 shared");
                    break;
                case 2:
                    System.out.println("Non attached 4 shared");
                    break;
                case 3:
                    System.out.println("Attached 4 shared");
                    break;
                case 4:
                    System.out.println("AC Non attached 4 shared");
                    break;
                case 5:
                    System.out.println("AC attached 4 shared");
                    break;
                default:
                    System.out.println("Invalid hostel type");
            }

            System.out.print("Mess type: ");
            switch (h.mess) {
                case 1:
                    System.out.println("South-Indian");
                    break;
                case 2:
                    System.out.println("North-Indian");
                    break;
                default:
                    System.out.println("Invalid mess type");
            }

            System.out.print("Diet type: ");
            switch (h.type) {
                case 1:
                    System.out.println("Vegetarian");
                    break;
                case 2:
                    System.out.println("Non Vegetarian");
                    break;
                default:
                    System.out.println("Invalid diet type");
            }

        } else {
            System.out.println("Invalid register number.");
        }
    }
}
