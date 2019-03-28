package com.train;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets: ");
        int tickets = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int rounds = scanner.nextInt();
        BookingTicket bookingTicket = new BookingTicket(tickets, rounds);
        bookingTicket.bill();
        bookingTicket.print();
    }
}
