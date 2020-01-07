package org.cap.entities;

public class AppUser {

    private int id;

    private String password;



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AppUser(){

    }

    public AppUser(int id,String password){
        this.password=password;
        this.id=id;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AppUser)) {
            return false;
        }
        AppUser user = (AppUser) obj;
        return user.id==(this.id);
    }

    @Override
    public int hashCode() {
        return id;
    }

}
