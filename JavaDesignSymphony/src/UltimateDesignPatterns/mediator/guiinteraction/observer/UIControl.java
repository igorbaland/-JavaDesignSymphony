package UltimateDesignPatterns.mediator.guiinteraction.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler observer) {
        eventHandlers.add(observer);
    }

    protected void notifyEventHandlers() {
        for (var observer : eventHandlers)
            observer.handler();
    }
}