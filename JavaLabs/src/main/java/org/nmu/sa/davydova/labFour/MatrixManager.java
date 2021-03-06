package org.nmu.sa.davydova.labFour;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatrixManager {

	public static final int RANDOM_VALUE = 20;
	public static final int NUMBER_OF_ROWS = 5;
	public static final int NUMBER_OF_COLUMNS = 5;

	public static void main(String[] args) {

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
		System.out.println("Minimum element: " + usedMatrix.getMatrixMinElement());
		usedMatrix.setMatrixSumElements(manager.toCountSum(usedMatrix));
		System.out.println("Sum of elements: " + usedMatrix.getMatrixSumElements());
	}

	List<List<Integer>> createMatrix(int numberOfRows, int numberOfColumns) {
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

	private int toCountSum(Matrix matrixInformation) {
		int toCountSum = 0;
		for (int i = 0; i < matrixInformation.getCountRows(); i++) {
			for (int j = 0; j < matrixInformation.getCountColumns(); j++) {
				toCountSum += matrixInformation.getMatrixElements().get(i).get(j);
			}
		}
		return toCountSum;
	}

	private int toSearchMaximum(Matrix matrixInformation) {
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

	private int toSearchMinimum(Matrix matrixInformation) {
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

	private void toPrintMatrix(Matrix matrixInformation) {
		for (int i = 0; i < matrixInformation.getCountRows(); i++) {
			for (int j = 0; j < matrixInformation.getCountColumns(); j++) {
				System.out.print(matrixInformation.getMatrixElements().get(i).get(j) + " ");
			}
			System.out.println("");
		}
	}

}
