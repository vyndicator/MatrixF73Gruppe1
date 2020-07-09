package snippet;

import java.util.ArrayList;
import java.util.List;


public class Matrix {

	private Integer[][] fields;
	private Integer rowCount;
	private Integer columnCount;

	private int elementCounter = 0;

	public Matrix(int amountOfRows, int amountOfColumns) {
		this.fields = new Integer[amountOfRows][amountOfColumns];
		this.rowCount = amountOfRows;
		this.columnCount = amountOfColumns;
	}

	public void fillColumnsLineWise(Integer... numbers) {
			int i = 0;
			for (int rowIndex = 0; rowIndex < this.fields.length; rowIndex++) {
				for (int columnIndex = 0; columnIndex < this.fields[rowIndex].length; columnIndex++) {
					if (this.fields[rowIndex][columnIndex] == null) {
						this.fields[rowIndex][columnIndex] = numbers[i];
						this.elementCounter++;
						i++;
						
					}
				}
			}
	}

	public Row getRow(int index) {
		return new Row(this.fields[index]);
	}

	public Column getColumn(int columnIndex) {
		Integer[] column = new Integer[getColumnCount()];
		for (int rowIndex = 0; rowIndex < this.fields.length; rowIndex++) {
			column[rowIndex] = this.fields[rowIndex][columnIndex];
		}
		return new Column(column);
	}

	public Integer[][] getFields() {
		return this.fields;
	}

	public Integer getRowCount() {
		return this.rowCount;
	}

	public Integer getColumnCount() {
		return this.columnCount;
	}

	public void print() {
		for (int rowIndex = 0; rowIndex < this.fields.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < this.fields[rowIndex].length; columnIndex++) {
				System.out.print(this.fields[rowIndex][columnIndex] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public List<Row> getRows() {
		List<Row> rows = new ArrayList<>();
		for (int rowIndex = 0; rowIndex < getRowCount(); rowIndex++) {
			rows.add(getRow(rowIndex));
		}
		return rows;
	}

	public List<Column> getColumns() {
		List<Column> columns = new ArrayList<>();
		for (int columnIndex = 0; columnIndex < getColumnCount(); columnIndex++) {
			columns.add(getColumn(columnIndex));
		}
		return columns;
	}

}
