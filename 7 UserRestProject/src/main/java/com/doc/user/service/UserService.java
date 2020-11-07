package com.doc.user.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.doc.user.model.User;
import com.doc.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	
	//get all
	public List<User> getAllUsers(){
		List<User> users = userRepo.findAll();
		return users;
	}
	
	//get by id
	public Optional<User> getById(long id) {
		return userRepo.findById(id);
	}
	
	//add user
	public User addUser(User user) {
		return userRepo.save(user);
	}
	
	//update user
	public User updateUser(User user) {
		return userRepo.save(user);
	}
	
	//delete user
	public void deleteUser(long id) {
		userRepo.deleteById(id);
	}

}
