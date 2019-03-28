package com.train;

public class BookingTicket {
    int tickets;
    int rounds;
    int bill;

    public BookingTicket(int tickets, int rounds) {
        this.tickets = tickets;
        this.rounds = rounds;
    }
    public int bill () {
        int bill = 1000*(tickets - rounds) + 2000*rounds*9/10;
        this.bill = bill;
        return bill;
    }
    public void print() {
        System.out.println("Total tickets: " + tickets );
        System.out.println("Round-trip: " + rounds );
        System.out.println("Total: " + bill );
    }

}
