package Optionals;
import java.util.*;

public class AccountsService {
	private List<Account> accounts;
	//Initialization block
	{
		accounts = new ArrayList<>();
		accounts.add(new Account(1, "Charlie Brown"));
		accounts.add(new Account(2, "Lucy Van Pelt"));
		accounts.add(new Account(3, "Peppermint Patty"));
	}
	
	public List<Account> read(){
		return accounts;
	}
	/*
	public Account read(int id) {
		Account account = null;
		for(Account item : accounts) {
			if(item.getId() == id) {
				account = item;
				break;
			}
		}
		return account;
	}*/
	
	public Optional<Account> read(int id) {
		Account account = null;
		for(Account item : accounts) {
			if(item.getId() == id) {
				account = item;
				break;
			}
		}
		return Optional.ofNullable(account);
	}
}
