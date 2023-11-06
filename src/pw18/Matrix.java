package pw18;

public class Matrix<T> {
    private final T[][] matrix;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public void setValue(int index1, int index2, T value) {
        if (matrix.length >= index1 && matrix[index1].length >= index2) {
            matrix[index1][index2] = value;
        } else {
            System.out.println("Incorrect coordinates");
        }
    }

    public void printMatrix() {
        for (T[] row : matrix) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}