package src;

import java.nio.file.DirectoryStream.Filter;
import java.util.*;

import javax.xml.stream.events.Namespace;

public class main {

	public static void main(String[] args) {
		User johnSmith = new User("John", "Smith", "jsmith");
		User jackieSmith = new User("Jackie", "Smith", "jsmith");
		User jeremySmith = new User("Jeremy", "Smith", "jsmith");
		User lucyVanPelt = new User("Lucy", "Van Pelt", "lvanpelt");
		User charlieBrown = new User("Charlie", "Brown", "cbrown");

		List<User> users = new ArrayList<>();
		users.add(lucyVanPelt);
		users.add(jeremySmith);
		users.add(johnSmith);
		users.add(charlieBrown);
		users.add(jackieSmith);

		// Consumer<User> displayUser = user -> System.out.println("user is: "+user);
		for (User user : users) {
			System.out.println(user);
			// displayUser.accept(user);
		}
		Collections.sort(users);
		System.out.println("users sorted by id, ascending: " + users);

		long countofNamesThatBeginWithJ = names.stream().filter(startsWithJ).count();
		System.out.println("count of names that start with J: " + countofNamesThatBeginWithJ);

		System.out.print("names that start with J are: ");
		names.stream().filter(startswithJ).sorted().forEach(n -> System.out.println(n + " "));
		System.out.println("names mapped by first letter: ");
		Map<Character, List<String>> namesByFirstLetterMapping;
		namesByFirstLetterMapping = names.stream().collect(Collectors.groupingBy(n -> n.charAt(0)));
		namesByFirstLetterMapping.forEach((key, value) -> Collections.sort(value));
		namesByFirstLetterMapping.forEach((key, value) -> System.out.println(key + "=" + value));
	}

}
