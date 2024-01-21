package UltimateDesignPatterns.command.video;

public class SetTextCommand extends AbstractUndoableCommand {
    private String text;

    public SetTextCommand(String text, VideoEditor video, History history) {
        super(video, history);

        this.text = text;
    }

    @Override
    public void undo() {
        videoEditor.removeText();
    }

    @Override
    public void doExecute() {
        videoEditor.setText(text);
    }
}
