package UltimateDesignPatterns.command.solution;

import UltimateDesignPatterns.command.solution.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
