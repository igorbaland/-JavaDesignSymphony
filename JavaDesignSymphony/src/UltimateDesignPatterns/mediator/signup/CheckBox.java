package UltimateDesignPatterns.mediator.signup;

public class CheckBox extends UIControl{
    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
        notifyEventHandlers();
    }
}
