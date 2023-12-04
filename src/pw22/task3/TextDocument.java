package pw22.task3;

public class TextDocument implements IDocument {
    @Override
    public void save() {
        System.out.println("Text document has been saved");
    }

    @Override
    public void exit() {
        System.out.println("Text document has been closed");
    }
}
