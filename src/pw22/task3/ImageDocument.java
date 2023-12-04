package pw22.task3;

public class ImageDocument implements IDocument {
    @Override
    public void save() {
        System.out.println("Image document has been saved");
    }

    @Override
    public void exit() {
        System.out.println("Image document has been closed");
    }
}
