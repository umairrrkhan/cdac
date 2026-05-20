package jdbc;
import java.util.Scanner;

public class StaffMain {
	public static void main(String args[]) {
        try {
            Staff s = new Staff();
            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("1. Add Staff");
                System.out.println("2. Display All Staff");
                System.out.println("3. Update Staff");
                System.out.println("4. Delete Staff");
                System.out.println("5. Exit");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        s.addStaff();
                        break;
                    case 2:
                        s.displayStaff();
                        break;
                    case 3:
                        s.updateStaff();
                        break;
                    case 4:
                        s.deleteStaff();
                        break;
                    case 5:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } while (choice != 5);

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
