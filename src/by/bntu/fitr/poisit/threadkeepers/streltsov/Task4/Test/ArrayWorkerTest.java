package by.bntu.fitr.poisit.threadkeepers.streltsov.Task4.Test;

import by.bntu.fitr.poisit.threadkeepers.streltsov.Task4.Model.Entity.Matrix;
import by.bntu.fitr.poisit.threadkeepers.streltsov.Task4.Model.Logic.ArrayWorker;
import org.junit.Assert;
import org.junit.Test;

public class ArrayWorkerTest {

    @Test
    public void findMonotoneSequenceColumnsTest() {
        Matrix matrix = new Matrix(new double[][]{{3.5, 4.6, 45},
                {4.5, 7.5, 8},
                {5.5, 3.3, 9}});
        String expecteds = "0";
        StringBuilder actuals = ArrayWorker.findMonotoneSequenceColumns(matrix);
        Assert.assertEquals(expecteds, actuals.toString());
    }

    @Test
    public void findMonotoneSequenceColumnsTest1() {
        Matrix matrix = new Matrix(new double[][]{{3.5, 4.6, 45},
                {4.5, 7.5, 8}});
        String expecteds = "0 1 2";
        StringBuilder actuals = ArrayWorker.findMonotoneSequenceColumns(matrix);
        Assert.assertEquals(expecteds, actuals.toString());
    }


    @Test
    public void findMonotoneSequenceColumnsTest2() {
        Matrix matrix = new Matrix(new double[][]{{3.5, 4.6, 4.5},
                {2.5, 7.5, 8},
                {1.5, 3.3, 9}});
        String expecteds = "0 2";
        StringBuilder actuals = ArrayWorker.findMonotoneSequenceColumns(matrix);
        Assert.assertEquals(expecteds, actuals.toString());
    }
}
