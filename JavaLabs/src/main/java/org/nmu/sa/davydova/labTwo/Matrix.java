package org.nmu.sa.davydova.labTwo;

class Matrix {
	private int[][] matrixElements;
	private int countRows;
	private int countColumns;
	private int maxElement;
	private int minElement;
	private int sumElements;

	public int[][] getMatrixElements() {
		return matrixElements;
	}

	public int getCountRows() {
		return countRows;
	}

	public int getCountColumns() {
		return countColumns;
	}

	public int getMatrixMaxElement() {
		return maxElement;
	}

	public int getMatrixMinElement() {
		return minElement;
	}

	public int getMatrixSumElements() {
		return sumElements;
	}

	public void setMatrixElements(int[][] matrix) {
		matrixElements = matrix;
	}

	public void setCountRows(int rows) {
		countRows = rows;
	}

	public void setCountColumns(int columns) {
		countColumns = columns;
	}

	public void setMatrixMaxElement(int maxElem) {
		maxElement = maxElem;
	}

	public void setMatrixMinElement(int minElem) {
		minElement = minElem;
	}

	public void setMatrixSumElements(int sumElem) {
		sumElements = sumElem;
	}
}