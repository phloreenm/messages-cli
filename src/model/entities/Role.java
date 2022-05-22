package model.entities;

import model.dao.RoleDAO;

public class Role implements RoleDAO {
	
	private int userId;
	private int userRole;

	public Role() {
	}

	public Role(int userId, int userRole) {
		super();
		this.userId = userId;
		this.userRole = userRole;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserRole() {
		return userRole;
	}

	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "This Role object: userId: '" + userId + "', userRole: '" + userRole + "'.";
	}
	
	

}
