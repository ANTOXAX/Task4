package by.bntu.fitr.poisit.threadkeepers.streltsov.Task4.Model.Entity;

public class Matrix {

    public static final int DEFAULT_SIZE = 5;

    private double[][] matrix;

    public Matrix() {
        matrix = new double[DEFAULT_SIZE][DEFAULT_SIZE];
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(int row, int column){
        matrix = new double[row][column];
    }

    public Matrix(int size){
        this(size, size);
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public int getRowCount() {
        return matrix.length;
    }

    public int getColumnCount() {
        return matrix[0].length;
    }

    public double getElement(int row, int column) {
        return matrix[row][column];
    }

    public void setElement(int row, int column, double value) {
        matrix[row][column] = value;
    }

    public String toString() {
        String matrixText = "";
        for (double[] array: matrix) {
            for (double element: array) {
                matrixText += element + " ";
            }
            matrixText += "\n";
        }
        return matrixText;
    }

}
