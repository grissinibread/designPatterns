package memento.exercise;

import java.util.Stack;

public class DocumentHistory {
    Stack<DocumentState> documentHistory = new Stack<DocumentState>();

    public void add(DocumentState documentState) {
        documentHistory.push(documentState);
    }

    public DocumentState pop() {
        documentHistory.pop();
        return documentHistory.peek();
    }
}
