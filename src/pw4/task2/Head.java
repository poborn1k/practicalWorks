package pw4.task2;

public class Head {
    private boolean isExist;

    public Head(boolean isExist) {
        this.isExist = isExist;
    }

    public boolean isAlive() {
        return isExist;
    }

    public String toString() {
        if (isExist) {
            return "Head: +";
        }
        return "Head: -?";
    }
}
