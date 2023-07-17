import java.util.Scanner;

public class FlightBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Flight Booking System!");

        while (true) {
            System.out.println("1. Search flights");
            System.out.println("2. Book a flight");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    searchFlights();
                    break;
                case 2:
                    bookFlight();
                    break;
                case 3:
                    System.out.println("Thank you for using the Flight Booking System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void searchFlights() {
        // Code to search for available flights based on user input
        System.out.println("Flight search functionality is not implemented yet.");
    }

    private static void bookFlight() {
        // Code to book a flight based on user input
        System.out.println("Flight booking functionality is not implemented yet.");
    }
}
