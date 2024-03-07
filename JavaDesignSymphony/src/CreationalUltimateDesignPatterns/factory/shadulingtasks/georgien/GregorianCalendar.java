package CreationalUltimateDesignPatterns.factory.shadulingtasks.georgien;

import CreationalUltimateDesignPatterns.factory.shadulingtasks.Calendar;
import CreationalUltimateDesignPatterns.factory.shadulingtasks.Event;

import java.util.Date;

public class GregorianCalendar implements Calendar {
    @Override
    public void addEvent(Event every, Date data) {
        System.out.println("Adding an event on the given date.");
    }
}
