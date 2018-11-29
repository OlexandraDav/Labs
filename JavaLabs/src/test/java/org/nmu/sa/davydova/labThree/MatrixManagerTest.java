package org.nmu.sa.davydova.labThree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixManagerTest {

    private static Matrix matrix;
    private static MatrixManager matrixFunc;

    @Before
    public void doThis()
    {
        matrix = new Matrix();
        matrixFunc = new MatrixManager();

        matrix.setCountRows(3);
        matrix.setCountColumns(3);
        matrix.setMatrixElements(new int[][] {{3,3,3},{4,9,8},{7,4,1}});
    }

    @Test
    public void toCountSum() {
        //42
        assertEquals(42,matrixFunc.toCountSum(matrix));
    }

    @Test
    public void toSearchMaximum() {
        //1
        assertEquals(1,matrixFunc.toSearchMinimum(matrix));
    }

    @Test
    public void toSearchMinimum() {
        //9
        assertEquals(9,matrixFunc.toSearchMaximum(matrix));
    }
}