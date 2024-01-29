package UltimateDesignPatterns.mediator.signup;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    protected void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers() {
        for (var handler : eventHandlers)
            handler.handle();
    }
}
