package cinema;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Read room size
        System.out.println("Enter the number of rows:");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = Integer.parseInt(scanner.nextLine());

        // Initialize the seating chart to all 'S'
        char[][] seats = new char[rows][seatsPerRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                seats[i][j] = 'S';
            }
        }

        // 2) Menu loop
        while (true) {
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 0) {
                // Exit the program
                break;
            } else if (choice == 1) {
                // Show current seating
                printCinema(seats);
            } else if (choice == 2) {
                // Buy a ticket
                System.out.println();
                System.out.println("Enter a row number:");
                int chosenRow = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter a seat number in that row:");
                int chosenSeat = Integer.parseInt(scanner.nextLine());

                int price = calculateTicketPrice(rows, seatsPerRow, chosenRow);
                System.out.println();
                System.out.println("Ticket price: $" + price);

                // Mark the seat as bought
                seats[chosenRow - 1][chosenSeat - 1] = 'B';
            } else {
                // Invalid option
                System.out.println("Wrong choice! Please enter 0, 1, or 2.");
            }
        }
    }

    // Prints the "Cinema:" header and the current seats array
    private static void printCinema(char[][] seats) {
        int rows = seats.length;
        int cols = seats[0].length;

        System.out.println();
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int j = 1; j <= cols; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Calculates the ticket price using the same rules as before
    private static int calculateTicketPrice(int totalRows, int seatsPerRow, int chosenRow) {
        int totalSeats = totalRows * seatsPerRow;
        if (totalSeats <= 60) {
            return 10;
        } else {
            int frontHalf = totalRows / 2;
            return (chosenRow <= frontHalf) ? 10 : 8;
        }
    }
}
