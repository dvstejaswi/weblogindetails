package org.cap.Service;

import org.cap.dao.IUserDao;
import org.cap.entities.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
private IUserDao userDao;


public IUserDao getUserDao() {
	return userDao;
}
@Autowired
public void setUserDao(IUserDao userDao) {
	this.userDao = userDao;
}

@Override
public AppUser addUser(AppUser user) {
	AppUser user1=userDao.addUser(user);
		return user1;	
    //return IUserDao.addUser(c);
}

@Override
public AppUser getUserById(int id) {
    return userDao.getUserById(id);
}


@Override
public boolean credentialsCorrect(int id, String password) {
    boolean correct = userDao.credentialsCorrect(id,password);
    return correct;
}


}


