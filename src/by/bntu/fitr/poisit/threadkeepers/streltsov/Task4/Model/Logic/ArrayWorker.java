package by.bntu.fitr.poisit.threadkeepers.streltsov.Task4.Model.Logic;

import by.bntu.fitr.poisit.threadkeepers.streltsov.Task4.Model.Entity.Matrix;
//import java.util.Random;

public class ArrayWorker {

    //public static int MAX_NUMBER = 100;

    /*public static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (new Random()).nextInt(MAX_NUMBER);
            }
        }
        return matrix;
    }*/

    public static StringBuilder findMonotoneSequenceColumns(Matrix matrix) {
        StringBuilder monotoneSequenceColumns = new StringBuilder();
        for (int j = 0,
             sequenceChecker = 0; j < matrix.getColumnCount(); j++) {
            for (int i = 1; i < matrix.getRowCount(); i++) {
                if (sequenceChecker == 0) {
                    if (matrix.getRowCount() == 2 && matrix.getElement(i, j) != matrix.getElement(i-1, j)) {
                        monotoneSequenceColumns.append(j);
                        monotoneSequenceColumns.append(" ");
                        break;
                    }
                    else if (matrix.getElement(i, j) > matrix.getElement(i-1, j)){
                        sequenceChecker = 1;
                    } else if(matrix.getElement(i, j) < matrix.getElement(i-1, j)){
                        sequenceChecker = -1;
                    } else {
                        break;
                    }
                } else if (sequenceChecker == 1 && matrix.getElement(i, j) > matrix.getElement(i-1, j) ||
                        sequenceChecker == -1 && matrix.getElement(i, j) < matrix.getElement(i-1, j)) {
                    if (i == matrix.getRowCount() - 1) {
                        monotoneSequenceColumns.append(j);
                        monotoneSequenceColumns.append(" ");
                    }
                } else {
                    break;
                }
            }
            sequenceChecker = 0;
        }
        if (!monotoneSequenceColumns.toString().equals("")) {
            monotoneSequenceColumns.deleteCharAt(monotoneSequenceColumns.length() - 1);
        }
        return monotoneSequenceColumns;
    }
}
