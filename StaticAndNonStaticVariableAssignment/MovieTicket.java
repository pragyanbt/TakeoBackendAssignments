package StaticAndNonStaticVariableAssignment;

class MovieTicket {
    static int totalTicketsSold;   // static variable shared by all

    public static void main(String[] args) {
        totalTicketsSold++;
        System.out.println("Ticket booked. Total Tickets Sold = " + totalTicketsSold);

    }
}

