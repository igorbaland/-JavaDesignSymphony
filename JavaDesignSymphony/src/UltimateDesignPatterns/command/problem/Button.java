package UltimateDesignPatterns.command.problem;

public class Button {
    private String label;

    public void click() {
        /*
        The code that should be executed here will be dependent on where  we use this button. For example, on one dialog
        box,  where the user click this button, perhaps we want to save something to a database. Somewhere else, we
        could have another button, when the user click this button, perhaps we want to delete a record.

        At the time of designing this framework, at the time of implementing the button class, we don't know what code
        should be executed, when we click a button. The command aims to solve this problem.
         */
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
