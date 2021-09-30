package services;

import models.Booking;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class BookingComparator implements Comparator<Booking>{


    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getStartDay().compareTo(o2.getStartDay());
    }
}
