package cl.jandana.RestApp.db;

import java.util.HashMap;
import java.util.Map;

import cl.jandana.RestApp.model.User;

public class DataBase {

	private  Map<String, User> users = new HashMap<>();

	public DataBase() {
		users.put("1", new User(1,"Reve","kro"));
		users.put("2", new User(2,"Tio","barri"));
		users.put("3", new User(3,"Vegetta","77777777777"));
		users.put("4", new User(4,"Luna","Bella"));
		users.put("5", new User(5,"Jordy","wild"));
	}

	public  Map<String, User> getUsers() {
		return users;
	}

	public  void setUsers(Map<String, User> users) {
		this.users = users;
	}

}
