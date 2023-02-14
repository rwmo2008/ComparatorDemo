package java8lambda;

import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>(Arrays.asList("Karen", "Susan", "Harry", "Martin", "James", "Wendy", "Frank", "Cindy", "Mary", "Iris", "Joseph", "Jenny", "Nancy", "David", "Jane", "Ann", "Linda", "Jill", "Betty", "Peter", "Michael", "Christopher", "Kenneth", "Bruce", "John"));
		
		Comparator<String> reverseAlphabetComparer = (String s1, String s2) -> {return s2.compareTo(s1);};
		
		Collections.sort(names, reverseAlphabetComparer);
		
		System.out.println("names sorted in reverse alphabetical order: ");
		System.out.println(names);
		
		Comparator<String> nameLengthCompare = (s1, s2) -> s1.length() - s2.length();
		Collections.sort(names, nameLengthCompare);
		
		System.out.println("names sorted in length order: ");
		System.out.println(names);
		
		//Testable<String> startsWithJ = (String s) -> { return s.startsWith("J");};
		Testable<String> startsWithJ = s -> s.startsWith("J");
		System.out.println(startsWithJ.test("Joe"));
		Filter filter = new Filter();
		List<String> filteredNames = filter.getWhere(names, startsWithJ);
		System.out.println("all our names that start with J");
		System.out.println(filteredNames);
		
		filteredNames = filter.getWhere(names, n -> n.length() > 10);
		System.out.println("all our names that are more than 10 chars long");
		System.out.println(filteredNames);
	}

}
