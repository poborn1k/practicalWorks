package pw3;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    //private double speed = 0.0;

    public Ball() {}
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move( double newX, double newY){
        x += newX;
        y += newY;
    }
//    public void  setXYSpeed(double speed) {
//        this.speed = speed;
//    }
    public String toString() {
        return "Ball @ (" + x + ", " + y + ")";
    }
}
