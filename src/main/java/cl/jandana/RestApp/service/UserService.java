package cl.jandana.RestApp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cl.jandana.RestApp.db.DataBase;
import cl.jandana.RestApp.model.User;

public class UserService {
	static DataBase db = new DataBase();
	static Map<String, User> users = db.getUsers();

	public List<User> getAllUser() {

		return new ArrayList<User>(users.values());
	}

	public User getUserById(String id) {
		return users.get(id);
	}

	public User addtUser(User user) {
		user.setId(users.size() + 1);
		users.put(users.size() + 1 + "", user);
		return user;
	}

	public User deleteUser(String  id){
		User u =users.get(id);
		users.remove(id);
		return u;
	}
	
	public User updateUser(String id ,User user){
		user.setId(Integer.parseInt(id));
		users.replace(id, user);
		return user;
	}
}
