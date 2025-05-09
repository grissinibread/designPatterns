package memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<EditorState> history = new ArrayList<EditorState>();

    public void push(EditorState state) {
        history.add(state);
    }

    public EditorState pop() {
        return history.removeLast();
    }
}
