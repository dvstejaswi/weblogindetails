package org.cap.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.cap.entities.AppUser;
import org.springframework.stereotype.Repository;



@Repository
public class UserDaoImpl implements IUserDao {
	 private Map<Integer, AppUser> store = new HashMap<>();

	
	     @Override
	public AppUser addUser(AppUser user) {
		 store.put(user.getId(),user);
		 return user;
	}
	     public UserDaoImpl() {
	    	 AppUser user2= new AppUser(1,"teju");
	    	 addUser(user2);
	     }
	 
	 @Override
	 public AppUser getUserById(int id) {
		 AppUser user1 = store.get(id);
	        return user1;
	 }
	  @Override
	    public boolean credentialsCorrect(int id, String password) {
	        AppUser user = store.get(id);
	        if (user == null) {
	            return false;
	        }
	        return user.getPassword().equals(password);
	    }
}
