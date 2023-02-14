package Optionals;

import java.util.*;

public class main {

	public static void main(String[] args) {
		AccountsService service = new AccountsService();

		List<Account> accounts = service.read();
		accounts.forEach(a -> System.out.println(a));

		/*
		 * Account acct2 = service.read(2); System.out.println("acct2 is: " +
		 * acct2.getName());
		 * 
		 * Account acct4 = service.read(4); if(acct4 != null)
		 * System.out.println("acct4 is: " + acct4.getName());
		 */
		Optional<Account> optAcct2 = service.read(2);
		if (optAcct2.isPresent()) {
			System.out.println("optAcct2 is: " + optAcct2.get().getName());
		}
		
		Optional<Account> optAcct4 = service.read(4);
		if (optAcct4.isPresent()) {
			System.out.println("optAcct4 is: " + optAcct4.get().getName());
		}
	}

}
