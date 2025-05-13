package factory.exercise;

import java.util.Date;

public class Scheduler {
    private Calendar calendar = new GregorianCalendar();

    public void schedule(Event event) {
        var today = new Date();
        calendar.addEvent(event, today);
    }
}
