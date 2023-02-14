package booking;

public class MovieTicketClient extends Thread {

    private String customerName;
    public int numberOfTickets;
    private MovieTicketServer movieServer;
    // TBD

    public MovieTicketClient(MovieTicketServer movieServer, String customerName, int numberOfTickets) {
        // TBD
        this.movieServer = movieServer;
        this.customerName = customerName;
        this.numberOfTickets = numberOfTickets;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void run() {
        // TBD
        movieServer.bookTicket(MovieTicketClient.this);
    }
}