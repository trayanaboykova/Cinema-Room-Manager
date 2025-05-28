package cinema;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.println("Enter the number of rows:");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = Integer.parseInt(scanner.nextLine());

        int totalSeats = rows * seatsPerRow;
        int totalIncome;

        if (totalSeats <= 60) {
            // Small room: all tickets $10
            totalIncome = totalSeats * 10;
        } else {
            // Large room: front half $10, back half $8
            int frontHalfRows = rows / 2;
            int backHalfRows = rows - frontHalfRows;
            totalIncome = frontHalfRows * seatsPerRow * 10
                    + backHalfRows  * seatsPerRow * 8;
        }

        // Output
        System.out.println("Total income:");
        System.out.println("$" + totalIncome);
    }
}
