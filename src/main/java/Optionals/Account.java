package Optionals;

public class Account {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + "]";
	}
	public Account(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
