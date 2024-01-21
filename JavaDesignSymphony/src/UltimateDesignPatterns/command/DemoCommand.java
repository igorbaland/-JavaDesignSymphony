package UltimateDesignPatterns.command;

import UltimateDesignPatterns.command.editor.BoldCommand;
import UltimateDesignPatterns.command.editor.History;
import UltimateDesignPatterns.command.editor.HtmlDocument;
import UltimateDesignPatterns.command.editor.UndoCommand;
import UltimateDesignPatterns.command.solution.*;
import UltimateDesignPatterns.command.solution.fx.Button;
import UltimateDesignPatterns.command.video.SetContrastCommand;
import UltimateDesignPatterns.command.video.SetTextCommand;
import UltimateDesignPatterns.command.video.VideoEditor;

public class DemoCommand {
    public static void showVideoEditor() {
        var history = new UltimateDesignPatterns.command.video.History();
        var video = new VideoEditor();

        var setTextCommand = new SetTextCommand("video title", video, history);
        setTextCommand.execute();
        System.out.println("TEXT: " + video);

        var setContrastCommand = new SetContrastCommand(1, video, history);
        setContrastCommand.execute();
        System.out.println("CONTRAST: " + video);

        var undoCommand = new UltimateDesignPatterns.command.video.UndoCommand(history);
        undoCommand.execute();
        System.out.println("UNDO: " + video);

        undoCommand.execute();
        System.out.println("UNDO: " + video);

        undoCommand.execute();
        System.out.println("UNDO: " + video);
    }

    public static void showEditor() {
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
//        boldCommand.unexecute();
//        System.out.println(document.getContent());

    }

    public static void showCompositeCommand() {
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
        composite.execute();
    }

    public static void showSolution() {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }
}
