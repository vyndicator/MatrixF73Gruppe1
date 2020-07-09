package snippet;

import java.util.ArrayList;
import java.util.List;

public class MatrixMath {

	public static Matrix multiply(Matrix first, Matrix second) {
		Matrix product = new Matrix(first.getRowCount(), second.getColumnCount());

		List<Row> rows = first.getRows();
		List<Column> columns = second.getColumns();
		List<Integer> resultValues = new ArrayList<>();

		for (Row row : rows) {
			for (Column column : columns) {
				resultValues.add(multiplyElement(row, column));
			}
		}

		product.fillColumnsLineWise(resultValues.toArray(new Integer[resultValues.size()]));
		
		return product;
	}

	private static Integer multiplyElement(Row row, Column column) {
		Integer result = 0;
		for (int i = 0; i < row.getElements().size(); i++) {
			result += row.getElements().get(i) * column.getElements().get(i);
		}
		return result;
	}

}
