package UltimateDesignPatterns.template;

import UltimateDesignPatterns.template.gui.ChatWindow;
import UltimateDesignPatterns.template.solution.inheritance.TransferMoneyTask;

public class DemoTemplate {

    public static void showGui() {
        var window = new ChatWindow();
        window.close();
    }
    public static void showTransferMoneySolution() {
        var task = new TransferMoneyTask();
        task.execute();
    }
}
