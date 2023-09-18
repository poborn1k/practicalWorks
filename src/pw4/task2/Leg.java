package pw4.task2;

public class Leg {
    private String side;
    private boolean isExist;

    public Leg(char side, boolean isExist) {
        if (side == 'l') {
            this.side = "Left";
        } else {
            this.side = "Right";
        }
        this.isExist = isExist;
    }
    public String toString() {
        if (isExist) {
            return String.format("%s Leg: +", this.side);
        }
        return String.format("%s Leg: -", this.side);
    }
}
