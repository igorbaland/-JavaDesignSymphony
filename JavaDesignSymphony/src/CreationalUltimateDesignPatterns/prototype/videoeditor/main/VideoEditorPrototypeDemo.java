package CreationalUltimateDesignPatterns.prototype.videoeditor.main;

import CreationalUltimateDesignPatterns.prototype.videoeditor.ContextMenu;
import CreationalUltimateDesignPatterns.prototype.videoeditor.Text;
import CreationalUltimateDesignPatterns.prototype.videoeditor.Timeline;

public class VideoEditorPrototypeDemo {
    public static void show() {
        var timeline = new Timeline();
        var text = new Text("Hello");
        timeline.add(text);

        var menu = new ContextMenu(timeline);
        menu.duplicate(text);
    }
}
