package model;

import java.util.ArrayList;

public class User {

	private static ArrayList<User>users = new ArrayList<>();
	private String name;
	private String id;
	private String function;
	
	public static ArrayList<User> getUsers() {
		return users;
	}

	public static void setUsers(ArrayList<User> users) {
		User.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User(String name, String id,String function) {
		this.name = name;
		this.id = id;
		this.function = function;
	}
	
}
