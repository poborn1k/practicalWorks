package pw22.task1;

public class Complex {
    int real, image;

    Complex() {
        this.real = 0;
        this.image = 0;
    }

    Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        if (real == 0) {
            if (image == 0) {
                return "z = 0";
            }
            return String.format("z = %di", this.image);
        }
        if (image == 0) {
            return "z = " + this.real;
        }
        return String.format("z = %d + %di", this.real, this.image);
    }
}
