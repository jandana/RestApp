package cl.jandana.RestApp.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cl.jandana.RestApp.model.User;
import cl.jandana.RestApp.service.UserService;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserController {
	UserService userService =new UserService();
	
	
	@GET
	public List<User> getUsers() {
		return userService.getAllUser();
	}
	
	@GET
	@Path("/{userId}")
	public User getMessage(@PathParam("userId") String  userId){
		return userService.getUserById(userId);
	}
	
	//Content-Type application/json Header(1)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public User addUser(User user){
		return userService.addtUser(user);
		//return"dsdasda22222sdasd";
	}
	
	@DELETE
	@Path("/{userId}")
	public User deleteUser(@PathParam("userId") String  userId){
		return userService.deleteUser(userId);
	}
	
	@PUT
	@Path("/{Id}")
	public User updateUser(@PathParam("Id") String Id, User user){
		return userService.updateUser(Id, user);
	}
	
}
