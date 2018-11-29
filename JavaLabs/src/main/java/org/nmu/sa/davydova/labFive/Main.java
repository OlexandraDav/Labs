package org.nmu.sa.davydova.labFive;

import java.io.IOException;

public class Main {
    public static Matrix usedMatrix = new Matrix();
    public static MatrixManager manager = new MatrixManager();
    public static MatrixWriteRead arrayWriteReadGSON = new MatrixWriteRead();
    public static final int NUMBER_OF_ROWS = 5;
    public static final int NUMBER_OF_COLUMNS = 5;

    public static void main(String[] args) throws IOException {

        MatrixManager manager = new MatrixManager();
        Matrix usedMatrix = new Matrix();
        usedMatrix.setCountColumns(NUMBER_OF_COLUMNS);
        usedMatrix.setCountRows(NUMBER_OF_ROWS);
        usedMatrix.setMatrixElements(manager.createMatrix(usedMatrix.getCountRows(), usedMatrix.getCountColumns()));
        System.out.println("Matrix: ");
        manager.toPrintMatrix(usedMatrix);
        usedMatrix.setMatrixMaxElement(manager.toSearchMaximum(usedMatrix));
        System.out.println("Maximum element: " + usedMatrix.getMatrixMaxElement());
        usedMatrix.setMatrixMinElement(manager.toSearchMinimum(usedMatrix));
        System.out.println("Minimum element:  " + usedMatrix.getMatrixMinElement());
        usedMatrix.setMatrixSumElements(manager.toCountSum(usedMatrix));
        System.out.println("Sum of elements: " + usedMatrix.getMatrixSumElements());

        arrayWriteReadGSON.writeJSON(usedMatrix, "outputJson.txt");
        usedMatrix = arrayWriteReadGSON.readJSON(usedMatrix, "outputJson.txt");
    }

}
