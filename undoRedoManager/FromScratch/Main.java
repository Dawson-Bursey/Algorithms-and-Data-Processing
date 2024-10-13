package FromScratch;

public class Main {
    public static void main(String[] args) {
        UndoRedoManager manager = new UndoRedoManager();

        manager.performAction("Insert A");
        manager.performAction("Insert B");
        manager.performAction("Delete C");

        manager.undo(); // Undo "Delete C"
        manager.undo(); // Undo "Insert B"
        manager.redo(); // Redo "Insert B"
    }
}
