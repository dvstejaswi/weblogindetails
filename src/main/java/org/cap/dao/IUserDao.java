package org.cap.dao;

import java.util.Set;

import org.cap.entities.AppUser;

public interface IUserDao {
	AppUser addUser(AppUser c);
	boolean credentialsCorrect(int id, String password);
	AppUser getUserById(int id);

}
