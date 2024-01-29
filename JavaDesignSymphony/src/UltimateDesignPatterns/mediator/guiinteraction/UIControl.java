package UltimateDesignPatterns.mediator.guiinteraction;

public class UIControl {
    protected DialogBox owner;

    public UIControl(DialogBox owner) {
        this.owner = owner;
    }
}
