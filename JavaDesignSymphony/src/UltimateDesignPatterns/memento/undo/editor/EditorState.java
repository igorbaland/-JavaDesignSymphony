package UltimateDesignPatterns.memento.undo.editor;
/*
Single responsibility principle
  evely class should have a single responsibility
 */

//Memento
public class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
