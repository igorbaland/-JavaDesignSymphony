package CreationalUltimateDesignPatterns.factory.shadulingtasks.main;

import CreationalUltimateDesignPatterns.factory.shadulingtasks.Event;
import CreationalUltimateDesignPatterns.factory.shadulingtasks.Scheduler;
import CreationalUltimateDesignPatterns.factory.shadulingtasks.arabian.ArabianScheduler;

public class SchedulingTasksDemo {
    public static void show() {
        //Standard scheduler using the gregorian calendar
        var scheduler = new Scheduler();
        scheduler.schedule(new Event());

        //Arabian scheduler using the arabian calendar
        var arabianScheduler = new ArabianScheduler();
        arabianScheduler.schedule(new Event());
    }
}
