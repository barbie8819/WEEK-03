package doublyLinkedList.UndoRedoFunctions;

public class TextEditor {
    private class Node {
        String text;
        Node prev, next;

        Node(String text) {
            this.text = text;
            this.prev = null;
            this.next = null;
        }
    }
    private Node current;
    private int size;
    private final int limit;

    public TextEditor(int limit) {
        this.current = null;
        this.size = 0;
        this.limit = limit;
    }

    public void addState(String text) {
        Node newNode = new Node(text);

        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
        size++;

        // Trim history if exceeding limit
        while (size > limit) {
            Node temp = current;
            while (temp.prev != null) {
                temp = temp.prev;
            }
            temp.next.prev = null;
            temp.next = null;
            size--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public String getCurrentState() {
        return current != null ? current.text : "";
    }

}
