package application;

import model.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = scanner.nextInt();

        System.out.print("Check-in date (dd/MM/yyyy): ");
        LocalDate checkInDate = LocalDate.parse(scanner.next(), fmt);

        System.out.print("Check-in date (dd/MM/yyyy): ");
        LocalDate checkOutDate = LocalDate.parse(scanner.next(), fmt);

        if (!checkOutDate.isAfter(checkInDate)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }
        else {
            Reservation reservation = new Reservation(roomNumber, checkInDate, checkOutDate);
            System.out.printf("Reservation: %s%n", reservation);

            System.out.printf("%nEnter data to update the reservation: %n");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkInDate = LocalDate.parse(scanner.next(), fmt);

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkOutDate = LocalDate.parse(scanner.next(), fmt);

            LocalDate dateNow = LocalDate.now();

            if(checkInDate.isBefore(dateNow) || checkOutDate.isBefore(dateNow)){
                System.out.println("Error in reservation: Reservation dates for update must be futures dates");
            }
            else if (!checkOutDate.isAfter(checkInDate)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            }
            else{
                reservation.updateDates(checkInDate, checkOutDate);
                System.out.printf("Reservation: %s%n", reservation);
            }

        }

        scanner.close();

    }
}
