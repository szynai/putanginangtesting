import java.util.Scanner;

public class mdassmainto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2, result;
        char again;

        do {
            System.out.println("\nCALCULATOR");
            System.out.println("1. Addition (+)");
            System.out.println("2. Multiplication (*)");
            System.out.println("3. Division (/)");
            System.out.println("4. Exit");
            System.out.print("Choose an operation (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    switch (choice) {
                        case 1:
                            

                        case 2:
                            

                        case 3:
                           
                    }
                    break;

                case 4:
                    System.out.println("Calculator closed. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.print("Do you want to calculate again? (y/n): ");
            again = sc.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        System.out.println("Calculator closed. Goodbye!");
        sc.close();
    }
}
