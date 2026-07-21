class TicketCounter {
    private int availableTickets = 3;

    // synchronized method to make booking thread-safe
    public synchronized void bookTicket(String user, int ticketsWanted) {
        System.out.println(user + " is trying to book " + ticketsWanted + " ticket(s).");

        if (availableTickets >= ticketsWanted) {
            System.out.println("Booking successful for " + user);
            availableTickets -= ticketsWanted;
            System.out.println("Tickets left: " + availableTickets);
        } else {
            System.out.println("Booking failed for " + user + ". Not enough tickets.");
        }
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        Thread user1 = new Thread(() -> counter.bookTicket("User 1", 2));
        Thread user2 = new Thread(() -> counter.bookTicket("User 2", 2));
        Thread user3 = new Thread(() -> counter.bookTicket("User 3", 1));

        user1.start();
        user2.start();
        user3.start();
    }
}
