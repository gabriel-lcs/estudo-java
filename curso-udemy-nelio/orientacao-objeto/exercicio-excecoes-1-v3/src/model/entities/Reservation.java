package model.entities;

import model.exceptions.DomainException;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {

    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Reservation(){

    }

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException{
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public long duration(){
        return Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay()).toDays();
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException{
        LocalDate dateNow = LocalDate.now();

        if(checkIn.isBefore(dateNow) || checkOut.isBefore(dateNow)){
            throw new DomainException("Reservation dates for update must be futures dates");
        }
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public String toString() {
        return String.format("Room %d, checkin: %s, check-out: %s, %d nights", roomNumber, checkIn.format(fmt), checkOut.format(fmt), duration());
    }
}


