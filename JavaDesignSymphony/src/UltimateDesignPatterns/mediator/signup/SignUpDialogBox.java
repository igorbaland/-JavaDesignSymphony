package UltimateDesignPatterns.mediator.signup;

public class SignUpDialogBox {
    private TextBox usernameTextBox = new TextBox();
    private TextBox passwordTextBox = new TextBox();
    private CheckBox agreeToTermCheckBox = new CheckBox();
    private Button signUpButton = new Button();

    public SignUpDialogBox() {
        usernameTextBox.addEventHandler(this::controlChanged);
        passwordTextBox.addEventHandler(this::controlChanged);
        agreeToTermCheckBox.addEventHandler(this::controlChanged);
    }

    private void controlChanged() {
        signUpButton.setEnabled(isFormValid());
    }

    private boolean isFormValid() {
        return !usernameTextBox.isEmpty()
                && !passwordTextBox.isEmpty()
                && agreeToTermCheckBox.isChecked();
    }

    public void simulateUserInteraction() {
        System.out.println("Initially: " + signUpButton.isEnabled());

        usernameTextBox.setContent("username");
        System.out.println("After setting the username: " + signUpButton.isEnabled());

        passwordTextBox.setContent("password");
        System.out.println("After setting the password: " + signUpButton.isEnabled());

        agreeToTermCheckBox.setChecked(true);
        System.out.println("After agreeing to terms: " + signUpButton.isEnabled());

        passwordTextBox.setContent("");
        System.out.println("After removing the password: " + signUpButton.isEnabled());

        passwordTextBox.setContent("password");
        System.out.println("After re-setting the password: " + signUpButton.isEnabled());
    }

}
