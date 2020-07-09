package snippet;

public class Main {

	public static void main(String[] args) {
		
		Matrix matrix1 = new Matrix(3, 2);
		matrix1.fillColumnsLineWise(1, 2, 3, 4, 5, 6);
		matrix1.print();

		Matrix matrix2 = new Matrix(2, 3);
		matrix2.fillColumnsLineWise(1, 2, 3, 4, 5, 6);
		matrix2.print();

		MatrixMath.multiply(matrix1, matrix2).print();

	}
}
