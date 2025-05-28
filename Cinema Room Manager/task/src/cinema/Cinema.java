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

        // Initialize all seats to 'S'
        char[][] seats = new char[rows][seatsPerRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                seats[i][j] = 'S';
            }
        }

        // 2) Print initial seating
        printCinema(seats);

        // Blank line before the next prompts
        System.out.println();

        // 3) Read the user’s chosen seat
        System.out.println("Enter a row number:");
        int chosenRow = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a seat number in that row:");
        int chosenSeat = Integer.parseInt(scanner.nextLine());

        // 4) Determine ticket price
        int totalSeats = rows * seatsPerRow;
        int ticketPrice;
        if (totalSeats <= 60) {
            ticketPrice = 10;
        } else {
            int frontRows = rows / 2;
            // if rows is odd, integer division puts the extra row in back half
            if (chosenRow <= frontRows) {
                ticketPrice = 10;
            } else {
                ticketPrice = 8;
            }
        }

        // 5) Output the price
        System.out.println();
        System.out.println("Ticket price: $" + ticketPrice);

        // 6) Mark the seat as booked and re-print
        seats[chosenRow - 1][chosenSeat - 1] = 'B';
        System.out.println();
        printCinema(seats);
    }

    /**
     * Prints the seating chart in the form:
     * Cinema:
     *   1 2 3 ...
     * 1 S S S ...
     * 2 S B S ...
     */
    private static void printCinema(char[][] seats) {
        int rows = seats.length;
        int cols = seats[0].length;

        System.out.println("Cinema:");
        // Header: two spaces, then seat numbers
        System.out.print("  ");
        for (int j = 1; j <= cols; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Each row: row number + seat symbols
        for (int i = 0; i < rows; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
