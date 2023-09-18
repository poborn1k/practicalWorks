package pw4.task2;

public class Hand {
    private String side;
    private boolean isExist;

    public Hand(char side, boolean isExist) {
        if (side == 'l') {
            this.side = "Left";
        } else {
            this.side = "Right";
        }
        this.isExist = isExist;
    }
    public String toString() {
        if (isExist) {
            return String.format("%s Hand: +", this.side);
        }
        return String.format("%s Hand: -", this.side);
    }
}
