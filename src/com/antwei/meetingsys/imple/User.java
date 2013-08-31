package com.antwei.meetingsys.imple;

public class User {

	private String name, pass, Department;
	private int permission;
	private int Manager;

	public User() {
	}

	public User(String name, String pass, String department, int permission,
			int manager) {
		this.name = name;
		this.pass = pass;
		Department = department;
		this.permission = permission;
		Manager = manager;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getPass() {
		return pass;
	}

	private void setPass(String pass) {
		this.pass = pass;
	}

	private String getDepartment() {
		return Department;
	}

	private void setDepartment(String department) {
		Department = department;
	}

	private int getPermission() {
		return permission;
	}

	private void setPermission(int permission) {
		this.permission = permission;
	}

	private int getManager() {
		return Manager;
	}

	private void setManager(int manager) {
		Manager = manager;
	}

}
