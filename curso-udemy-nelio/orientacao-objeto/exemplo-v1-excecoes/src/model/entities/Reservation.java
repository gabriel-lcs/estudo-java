package model.entities;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {

    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Reservation(){

    }

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
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
        return Duration.between(checkOut.atStartOfDay(), checkIn.atStartOfDay()).toDays();
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public String toString() {
        return String.format("Room %d, checkin: %s, check-out: %s, %d nights%n", roomNumber, checkIn.format(fmt), checkOut.format(fmt), duration());
    }
}


