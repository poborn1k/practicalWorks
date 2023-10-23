package pw18;

public class Matrix<T> {
    private final T[][] matrix;

    Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    void printMatrix() {
        for (T[] row : matrix) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}