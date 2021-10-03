package utils;

import models.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator <Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getStartDay().compareTo(o2.getStartDay());
    }
}
