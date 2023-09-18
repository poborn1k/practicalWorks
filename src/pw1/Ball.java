package pw1;

public class Ball {
    private int price;
    private String firm;

    public Ball(String firm, int price) {
        this.firm = firm;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public int getPrice() {
        return price;
    }

    public String getFirm() {
        return firm;
    }

    public String toString() {
        return String.format("Ball firm is %s and price is %d", this.firm, this.price);
    }
}
