package UltimateDesignPatterns.template.gui;

public class ChatWindow extends Window{
    @Override
    protected void onClosed() {
        System.out.println("Disconnecting from the server...");
    }
}
