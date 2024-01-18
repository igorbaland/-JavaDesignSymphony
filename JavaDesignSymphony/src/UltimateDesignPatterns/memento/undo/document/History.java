package UltimateDesignPatterns.memento.undo.document;

import UltimateDesignPatterns.memento.undo.editor.EditorState;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<DocumentState> list = new ArrayList<>();

    public void push(DocumentState state) {
        list.add(state);
    }

    public DocumentState pop() {
        var lastIndex = list.size() - 1;
        var lastState = list.get(lastIndex);
        list.remove(lastState);

        return lastState;
    }
}
