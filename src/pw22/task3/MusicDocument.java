package pw22.task3;

public class MusicDocument implements IDocument {
    @Override
    public void save() {
        System.out.println("Music document has been saved");
    }

    @Override
    public void exit() {
        System.out.println("Music document has been closed");
    }
}
