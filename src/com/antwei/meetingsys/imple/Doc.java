package com.antwei.meetingsys.imple;

public class Doc {

	private String name, path;
	private long date;

	public Doc() {

	}
	
	public Doc(String name, String path, long date){
		this.name = name;
		this.path = path;
		this.date = date;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getPath() {
		return path;
	}

	private void setPath(String path) {
		this.path = path;
	}

	private long getDate() {
		return date;
	}

	private void setDate(long date) {
		this.date = date;
	}


}
