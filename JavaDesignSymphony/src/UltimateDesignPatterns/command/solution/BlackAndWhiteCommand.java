package UltimateDesignPatterns.command.solution;

import UltimateDesignPatterns.command.solution.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("B&W");
    }
}
