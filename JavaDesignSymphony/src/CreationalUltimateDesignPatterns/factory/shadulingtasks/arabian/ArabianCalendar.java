package CreationalUltimateDesignPatterns.factory.shadulingtasks.arabian;

import CreationalUltimateDesignPatterns.factory.shadulingtasks.Calendar;
import CreationalUltimateDesignPatterns.factory.shadulingtasks.Event;

import java.util.Date;

public class ArabianCalendar implements Calendar {
    @Override
    public void addEvent(Event every, Date data) {
        System.out.println("Adding an event to the arabian calendar");
    }
}
