# 🎬 Cinema Room Manager

I built this project as part of my journey to mastering Java fundamentals through practical console applications. The Cinema Room Manager helps theater staff automate ticket sales, visualize seating, and track sales statistics in a simple menu-driven interface.

## 🚀 Project Overview
This training project walks through multiple stages of development, gradually adding functionality:

Seating Visualization – Print a 2D seating chart to the console.

Income Calculation – Compute total potential income based on room size and tiered pricing.

Ticket Pricing – Allow lookup of a single ticket’s price based on seat coordinates.

Interactive Menu – Add options to buy tickets, show seats, and exit.

Statistics & Validation – Display real-time stats (tickets sold, occupancy %, income) and enforce input checks to prevent double-booking or invalid seat selection.

## 🎯 What I Learned
- 🏗️ Core Java I/O: Reading user input with Scanner and BufferedReader.
- 🔄 Control Structures: Using loops and switch/if statements to drive a menu.
- 🔢 2D Arrays: Modeling the seating chart and updating individual seats.
- 💰 Business Logic: Implementing tiered pricing rules and calculating current vs. total income.
- 🛡️ Error Handling: Validating coordinates, handling out-of-bounds and already-booked seats without crashing.
- ⚙️ Method Design: Refactoring repeated logic (printing, price calculation, statistics) into helper methods.

## 🔧 Features
- ✅ Visual Seating Chart: Displays rows and seats marked “S” (available) or “B” (booked).
- ✅ Buy Tickets: Prompt for row/seat, calculate price, mark seat, reject invalid or already-taken inputs.
- ✅ Real-Time Statistics: View number of tickets sold, percentage occupancy (2-decimal), current income, and total possible income.
- ✅ Menu-Driven UI: Intuitive 0–3 options loop (Show seats, Buy ticket, Statistics, Exit).
- ✅ Robust Validation: Prevents out-of-range selections and double bookings via input loops.

## 📂 Project Structure

`Main.java` – Entrypoint: reads dimensions, initializes state, and runs the menu loop.

Helper Methods:

`printCinema(char[][])` – Renders the seating arrangement.

`calculateTicketPrice(...)` – Applies pricing rules.

`calculateTotalIncome(...)` – Computes full-house revenue.

`showStatistics(...)` – Gathers and prints sales stats.

State Management – A 2D char array tracks seat status; counters track sales and income.

## 🛠️ Technologies I Used
[![Java](https://skillicons.dev/icons?i=java&theme=light)](https://www.java.com/)  

🤔 How to Run
1. **Clone the repository**:  
   ```bash
   git clone https://github.com/trayanaboykova/Cinema-Room-Manager.git
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA).
3. Compile and run the `Main.java` file.
4. Follow on-screen menu to show seats, buy tickets, view stats, or exit.

## 📈 Learning Outcomes
By completing this project, I:

Strengthened my grasp of array manipulation and console I/O.

Practiced breaking a complex problem into manageable functions.

Enhanced my skills in validating user input and handling edge cases.

Learned to track and display statistics in real time within a stateful application.

## 🌟 Acknowledgments
Thanks to JetBrains Academy for the project template and the Java community for continuous inspiration and best practices!
