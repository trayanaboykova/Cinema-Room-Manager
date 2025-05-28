package cinema;

public class Cinema {
    public static void main(String[] args) {
        int rows = 7;
        int seatsPerRow = 8;

        // Title
        System.out.println("Cinema:");

        // Header row (seat numbers)
        System.out.print("  "); // two spaces to align under the title
        for (int seat = 1; seat <= seatsPerRow; seat++) {
            System.out.print(seat + " ");
        }
        System.out.println();

        // Each row: row number + seats ("S")
        for (int row = 1; row <= rows; row++) {
            System.out.print(row + " ");
            for (int seat = 1; seat <= seatsPerRow; seat++) {
                System.out.print("S ");
            }
            System.out.println();
        }
    }
}
