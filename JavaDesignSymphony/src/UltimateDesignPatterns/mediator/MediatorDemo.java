package UltimateDesignPatterns.mediator;

import UltimateDesignPatterns.mediator.guiinteraction.ArticlesDialogBox;
import UltimateDesignPatterns.mediator.signup.SignUpDialogBox;

public class MediatorDemo {

    public static void showSignUp() {
        var signUpDialogBox = new SignUpDialogBox();
        signUpDialogBox.simulateUserInteraction();
    }
    public static void showGuiInteraction() {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}
