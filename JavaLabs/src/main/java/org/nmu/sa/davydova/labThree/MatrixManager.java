package org.nmu.sa.davydova.labThree;

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

	public int[][] createMatrix(int numberOfRows, int numberOfColumns) {
		int[][] matrix = new int[numberOfRows][numberOfColumns];
		Random ForRandomElements = new Random();
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfColumns; j++) {
				matrix[i][j] = ForRandomElements.nextInt(2 * RANDOM_VALUE) - RANDOM_VALUE;
			}
		}
		return matrix;
	}

	public int toCountSum(Matrix matrixInformation) {
		int toCountSum = 0;
		for (int i = 0; i < matrixInformation.getCountRows(); i++) {
			for (int j = 0; j < matrixInformation.getCountColumns(); j++) {
				toCountSum += matrixInformation.getMatrixElements()[i][j];
			}
		}
		return toCountSum;
	}

	public int toSearchMaximum(Matrix matrixInformation) {
		int max = matrixInformation.getMatrixElements()[0][0];

		for (int i = 0; i < matrixInformation.getCountRows(); i++) {
			for (int j = 0; j < matrixInformation.getCountColumns(); j++) {
				if (max < matrixInformation.getMatrixElements()[i][j]) {
					max = matrixInformation.getMatrixElements()[i][j];
				}
			}
		}
		return max;
	}

	public int toSearchMinimum(Matrix matrixInformation) {
		int min = matrixInformation.getMatrixElements()[0][0];

		for (int i = 0; i < matrixInformation.getCountRows(); i++) {
			for (int j = 0; j < matrixInformation.getCountColumns(); j++) {
				if (min > matrixInformation.getMatrixElements()[i][j]) {
					min = matrixInformation.getMatrixElements()[i][j];
				}
			}
		}
		return min;
	}

	public void toPrintMatrix(Matrix matrixInformation) {
		for (int i = 0; i < matrixInformation.getCountRows(); i++) {
			for (int j = 0; j < matrixInformation.getCountColumns(); j++) {
				System.out.print(matrixInformation.getMatrixElements()[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
