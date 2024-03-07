package CreationalUltimateDesignPatterns.factory.shadulingtasks;

import CreationalUltimateDesignPatterns.factory.shadulingtasks.georgien.GregorianCalendar;

import java.util.Date;

public class Scheduler {
    private Calendar calendar = createCalendar();

    protected Calendar createCalendar() {
        return new GregorianCalendar();
    }

    public void schedule(Event event) {
        var today = new Date();
        calendar.addEvent(event, today);
    }
}
