package org.cap.Service;

import java.util.Set;

import org.cap.entities.AppUser;

public interface IUserService {
	AppUser addUser(AppUser c);
	boolean credentialsCorrect(int id, String password);
	AppUser getUserById(int id);


}
