package org.nmu.sa.davydova.labFive;

import org.junit.Test;
import org.junit.Before;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static org.junit.Assert.*;

public class MatrixWriteReadTest {
    private static Matrix matrix;
    private static MatrixManager matrixFunc;
    public static MatrixWriteRead writeReadJSON = new MatrixWriteRead();

    @Before
    public void doThis() throws IOException {
        matrix = new Matrix();
        matrixFunc = new MatrixManager();

        matrix.setCountRows(3);
        matrix.setCountColumns(3);
        matrix.setMatrixElements(new int[][] {{3,3,3},{4,9,8},{7,4,1}});

        writeReadJSON.writeJSON(matrix, "labFive.txt");
    }

    @Test
    public void writeJsonSON() throws IOException {
        assertTrue(writeReadJSON.writeJSON(matrix, "labFive.txt"), true);
    }

    @Test
    public void readJSON() throws IOException {
         assertEquals(writeReadJSON.readJSON(matrix, "labFive.txt"), matrix);
    }
}