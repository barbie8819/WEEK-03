package circularLinkedList.OnlineTicketReservation;

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        system.addTicket(1, "Alice", "Avengers", "A10", "10:30 AM");
        system.addTicket(2, "Bob", "Batman", "B15", "12:00 PM");
        system.addTicket(3, "Charlie", "Spiderman", "C20", "2:30 PM");

        system.displayTickets();

        system.removeTicket(2);
        System.out.println("After removing ticket 2:");
        system.displayTickets();

        System.out.println("Total Tickets: " + system.getTotalTickets());

        TicketReservationSystem.TicketNode found = system.searchTicket("Charlie");
        if (found != null) {
            System.out.println("Found Ticket for Charlie: " + found.ticketId);
        } else {
            System.out.println("Ticket not found.");
        }
    }

}
