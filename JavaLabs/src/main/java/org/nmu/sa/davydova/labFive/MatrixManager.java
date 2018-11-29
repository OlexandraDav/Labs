package org.nmu.sa.davydova.labFive;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatrixManager {

    public static final int RANDOM_VALUE = 20;

    public List<List<Integer>> createMatrix(int numberOfRows, int numberOfColumns) {
        List<List<Integer>> listElements = new ArrayList<List<Integer>>(numberOfRows);
        Random randomElements = new Random();
        for (int i = 0; i < numberOfRows; i++) {
            listElements.add(new ArrayList<Integer>());
            for (int j = 0; j < numberOfColumns; j++) {
                listElements.get(i).add(randomElements.nextInt(2 * RANDOM_VALUE) - RANDOM_VALUE);
            }
        }
        return listElements;
    }

    public int toCountSum(Matrix matrixInformation) {
        int toCountSum = 0;
        for (int i = 0; i < matrixInformation.getCountRows(); i++) {
            for (int j = 0; j < matrixInformation.getCountColumns(); j++) {
                toCountSum += matrixInformation.getMatrixElements().get(i).get(j);
            }
        }
        return toCountSum;
    }

    public int toSearchMaximum(Matrix matrixInformation) {
        int max = matrixInformation.getMatrixElements().get(0).get(0);

        for (int i = 0; i < matrixInformation.getCountRows(); i++) {
            for (int j = 0; j < matrixInformation.getCountColumns(); j++) {
                if (max < matrixInformation.getMatrixElements().get(i).get(j)) {
                    max = matrixInformation.getMatrixElements().get(i).get(j);
                }
            }
        }
        return max;
    }

    public int toSearchMinimum(Matrix matrixInformation) {
        int min = matrixInformation.getMatrixElements().get(0).get(0);

        for (int i = 0; i < matrixInformation.getCountRows(); i++) {
            for (int j = 0; j < matrixInformation.getCountColumns(); j++) {
                if (min > matrixInformation.getMatrixElements().get(i).get(j)) {
                    min = matrixInformation.getMatrixElements().get(i).get(j);
                }
            }
        }
        return min;
    }

    public void toPrintMatrix(Matrix matrixInformation) {
        for (int i = 0; i < matrixInformation.getCountRows(); i++) {
            for (int j = 0; j < matrixInformation.getCountColumns(); j++) {
                System.out.print(matrixInformation.getMatrixElements().get(i).get(j) + " ");
            }
            System.out.println("");
        }
    }

}
