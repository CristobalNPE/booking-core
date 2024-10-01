package dev.cnpe.bookingcore.domain.models;

import java.time.LocalTime;

public class TimeSlot {

    public enum TimeSlotStatus {
        AVAILABLE,
        BOOKED,
        BLOCKED
    }

    private Long id;
    private LocalTime startTime;
    private LocalTime endTime;
    //Vendor vendor;
    private TimeSlotStatus status;
    //Appointment appointment


}
