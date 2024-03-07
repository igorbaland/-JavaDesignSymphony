package CreationalUltimateDesignPatterns.factory.shadulingtasks.arabian;

import CreationalUltimateDesignPatterns.factory.shadulingtasks.Calendar;
import CreationalUltimateDesignPatterns.factory.shadulingtasks.Event;
import CreationalUltimateDesignPatterns.factory.shadulingtasks.Scheduler;

public class ArabianScheduler extends Scheduler {
    @Override
    protected Calendar createCalendar() {
        return new ArabianCalendar();
    }
}
