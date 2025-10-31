package in09.HashMapProject;

import java.util.ArrayList;
import java.util.List;

public class CollectioOfCollection_DB_Table {
	public static void main(String[] args) {
		List<List<Object>> table = new ArrayList<List<Object>>();
		List<Object> Columns = List.of("v1", "v2", "v3", "v4", "v5");
		List<Object> row1 = List.of(1, 2, 3, 4, 5);
		List<Object> row2 = List.of(2, 3, 4, 5, 6);
		List<Object> row3 = List.of(3, 4, 5, 6, 7);
		List<Object> row4 = List.of(4, 5, 6, 7, 8);
		List<Object> row5 = List.of(5, 6, 7, 8, 9);

		table.add(Columns);
		table.add(row1);
		table.add(row2);
		table.add(row3);
		table.add(row4);
		table.add(row5);

		System.out.println(table);

		System.out.println();

		table.forEach(System.out::println);

		System.out.println();
		// taking one by one element from the rows and printing
		table.forEach(row -> {
			for (Object integer : row) {
				System.out.print(integer + "\t");
			}
			System.out.println();

		});

	}

}
