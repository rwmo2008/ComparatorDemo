package java8lambda;

import java.util.*;

public class Filter {
	public <T> List<T> getWhere(List<T> list, Testable<T> tester) {
		List<T> filteredList = new ArrayList<>();
		for (T item : list) {
			if (tester.test(item)) {
				filteredList.add(item);
			}
		}
		return filteredList;
	}
}
