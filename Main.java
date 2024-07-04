import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        System.out.print("\n");


        while( loop == true) {
            System.out.print("\n");
            System.out.println("========== My Cinema ==========");
            System.out.print("\n");
            System.out.println("Select one option below");
            System.out.println("1 - Generate Report");
            System.out.println("2 - Buy Tickets");
            System.out.print("Option: ");
            int opt = scanner.nextInt();

            if (opt == 1) {

                System.out.print("\n");
                Database savedb = new Database();
                savedb.readData();
                System.out.print("\n");
                System.out.print("Digit 1 to back to menu or 2 to exit: ");
                int selection = scanner.nextInt();
                if (selection == 2) {
                    loop = false;
                    System.out.println("===============================");
                    System.out.println("Thank you for using our system.");
                    System.out.println("===============================");
                    System.out.print("\n");
                }

            } else if (opt == 2) {
                System.out.print("\n");
                BuyTicket buyT = new BuyTicket();
                buyT.start();
                loop = false;
//
//                loop = false;
//                System.out.println("\n");
//                System.out.print("Digit 1 to back to menu or 2 to exit: ");
//                int selection1 = scanner.nextInt();
//                if (selection1 == 2) {
//                    System.out.print("Thank you for using our system.");
//                    loop = false;

                }
            }

        }
//Run this code only one time to create Database, after that you can remove
//        CreateDB newdb = new CreateDB();
//        newdb.createDB();
    }
