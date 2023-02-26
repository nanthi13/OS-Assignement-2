package booking;

public class MovieTicketServer {
    public String movieName;
    public int availableSeats;
    // TBD

    public MovieTicketServer(String movieName, int availableSeats) {
        this.movieName = movieName;
        this.availableSeats = availableSeats;

        // TBD
    }

    public synchronized void bookTicket(MovieTicketClient client) {
        int numberOfSeats = client.numberOfTickets;
        String customerName = client.getCustomerName();
        movieName = this.movieName;


        System.out.println("Hi," + customerName + " : " + availableSeats + " : Seats available for " + movieName);
        if(( availableSeats - numberOfSeats) < 0) {
            System.out.println("Hi," + customerName + " : Seats not available for " + movieName);
        } else{
            System.out.println("Hi," + customerName + " : " + numberOfSeats + " Seats booked successfully for " + movieName);
            availableSeats -= numberOfSeats;
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
