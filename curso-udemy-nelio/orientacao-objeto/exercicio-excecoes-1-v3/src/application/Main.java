package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = scanner.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkInDate = LocalDate.parse(scanner.next(), fmt);

            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkOutDate = LocalDate.parse(scanner.next(), fmt);

            Reservation reservation = new Reservation(roomNumber, checkInDate, checkOutDate);
            System.out.printf("Reservation: %s%n", reservation);

            System.out.printf("%nEnter data to update the reservation: %n");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkInDate = LocalDate.parse(scanner.next(), fmt);

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkOutDate = LocalDate.parse(scanner.next(), fmt);

            reservation.updateDates(checkInDate, checkOutDate);

            System.out.printf("Reservation: %s%n", reservation);
        }
        catch (DomainException e){
            System.out.printf("Error in reservation: %s%n", e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

        scanner.close();

    }
}
