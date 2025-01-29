package doublyLinkedList.UndoRedoFunctions;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");

        System.out.println("Current State: " + editor.getCurrentState()); // "Hello World!"
        editor.undo();
        System.out.println("After Undo: " + editor.getCurrentState()); // "Hello World"
        editor.undo();
        System.out.println("After Undo: " + editor.getCurrentState()); // "Hello"
        editor.redo();
        System.out.println("After Redo: " + editor.getCurrentState()); // "Hello World"
    }

}
