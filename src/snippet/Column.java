package snippet;

import java.util.ArrayList;
import java.util.List;

public class Column {

	public Column(Integer[] row) {

		for (Integer integer : row) {
			this.elements.add(integer);
		}

	}

	private List<Integer> elements = new ArrayList<>();

	public List<Integer> getElements() {
		return this.elements;
	}

}
