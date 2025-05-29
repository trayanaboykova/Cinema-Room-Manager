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

        int totalSeats = rows * seatsPerRow;
        int totalIncome = calculateTotalIncome(rows, seatsPerRow);
        int currentIncome = 0;
        int purchasedTickets = 0;

        // 2) Initialize seating chart
        char[][] seats = new char[rows][seatsPerRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                seats[i][j] = 'S';
            }
        }

        // 3) Menu loop
        while (true) {
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 0) {
                // Exit
                break;
            } else if (choice == 1) {
                // Show seating
                printCinema(seats);
            } else if (choice == 2) {
                // Buy ticket with validation
                int chosenRow, chosenSeat;
                while (true) {
                    System.out.println();
                    System.out.println("Enter a row number:");
                    chosenRow = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter a seat number in that row:");
                    chosenSeat = Integer.parseInt(scanner.nextLine());

                    if (chosenRow < 1 || chosenRow > rows
                            || chosenSeat < 1 || chosenSeat > seatsPerRow) {
                        System.out.println();
                        System.out.println("Wrong input!");
                    } else if (seats[chosenRow - 1][chosenSeat - 1] == 'B') {
                        System.out.println();
                        System.out.println("That ticket has already been purchased!");
                    } else {
                        break;
                    }
                }

                int price = calculateTicketPrice(rows, seatsPerRow, chosenRow);
                seats[chosenRow - 1][chosenSeat - 1] = 'B';
                purchasedTickets++;
                currentIncome += price;

                System.out.println();
                System.out.println("Ticket price: $" + price);

            } else if (choice == 3) {
                // Statistics
                double percentage = purchasedTickets * 100.0 / totalSeats;

                System.out.println();
                System.out.println("Number of purchased tickets: " + purchasedTickets);
                System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
                System.out.println("Current income: $" + currentIncome);
                System.out.println("Total income: $" + totalIncome);

            } else {
                // Invalid menu choice
                System.out.println("Wrong choice! Please enter 0, 1, 2, or 3.");
            }
        }
    }

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

    private static int calculateTicketPrice(int totalRows, int seatsPerRow, int chosenRow) {
        int totalSeats = totalRows * seatsPerRow;
        if (totalSeats <= 60) {
            return 10;
        } else {
            int frontHalf = totalRows / 2;
            return (chosenRow <= frontHalf) ? 10 : 8;
        }
    }

    private static int calculateTotalIncome(int rows, int seatsPerRow) {
        int totalSeats = rows * seatsPerRow;
        if (totalSeats <= 60) {
            return totalSeats * 10;
        } else {
            int frontHalf = rows / 2;
            int backHalf = rows - frontHalf;
            return frontHalf * seatsPerRow * 10
                    + backHalf * seatsPerRow * 8;
        }
    }
}
