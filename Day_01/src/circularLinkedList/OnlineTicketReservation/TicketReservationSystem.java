package circularLinkedList.OnlineTicketReservation;

public class TicketReservationSystem {
    public class TicketNode {
        int ticketId;
        String customerName, movieName, seatNumber, bookingTime;
        TicketNode next;

        TicketNode(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
            this.ticketId = ticketId;
            this.customerName = customerName;
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.bookingTime = bookingTime;
            this.next = null;
        }
    }

    private TicketNode last;
    private int size;

    public TicketReservationSystem() {
        this.last = null;
        this.size = 0;
    }

    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newNode = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void removeTicket(int ticketId) {
        if (last == null) return;

        TicketNode current = last.next, prev = last;
        do {
            if (current.ticketId == ticketId) {
                if (current == last && current.next == last) {
                    last = null;
                } else {
                    prev.next = current.next;
                    if (current == last) {
                        last = prev;
                    }
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);
    }

    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }
        TicketNode current = last.next;
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer: " + current.customerName + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != last.next);
    }

    public TicketNode searchTicket(String key) {
        if (last == null) return null;

        TicketNode current = last.next;
        do {
            if (current.customerName.equalsIgnoreCase(key) || current.movieName.equalsIgnoreCase(key)) {
                return current;
            }
            current = current.next;
        } while (current != last.next);

        return null;
    }

    public int getTotalTickets() {
        return size;
    }
}
