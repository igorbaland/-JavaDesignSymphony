package UltimateDesignPatterns.command.video;

public class SetContrastCommand extends AbstractUndoableCommand{
    private float prevContrast;
    private float contrast;
    public SetContrastCommand(float contrast, VideoEditor video, History history) {
        super(video, history);

        prevContrast = videoEditor.getContrast();
        this.contrast = contrast;
    }

    @Override
    public void doExecute() {
        videoEditor.setContrast(contrast);
    }

    @Override
    public void undo() {
        videoEditor.setContrast(prevContrast);
    }
}
