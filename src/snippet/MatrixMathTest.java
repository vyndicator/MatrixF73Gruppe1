package snippet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatrixMathTest {

	@Test
	void multiplyTest() {
		Matrix matrix1 = new Matrix(3, 2);
		matrix1.fillColumnsLineWise(1, 2, 3, 4, 5, 6);
		
		Matrix matrix2 = new Matrix(2, 3);
		matrix1.fillColumnsLineWise(1, 2, 3, 4, 5, 6);
		
		Matrix matrix3 = new Matrix(3, 3);
		matrix1.fillColumnsLineWise(9, 12, 15, 19, 26, 33, 29, 40, 51);
	}

}
