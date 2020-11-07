package com.doc.user.restcontroller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doc.user.model.User;
import com.doc.user.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService uService;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return uService.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable("id") long id) {
		return uService.getById(id);
	}
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return uService.addUser(user);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return uService.updateUser(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") long id) {
		uService.deleteUser(id);
	}
}
