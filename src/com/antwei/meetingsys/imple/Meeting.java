package com.antwei.meetingsys.imple;

public class Meeting {

	private String name;
	private long date;
	private Doc doc;
	private String intro;
	private int permission;

	public Meeting() {

	}

	public Meeting(String name, long date, Doc doc, String intro) {
		super();
		this.name = name;
		this.date = date;
		this.doc = doc;
		this.intro = intro;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private long getDate() {
		return date;
	}

	private void setDate(long date) {
		this.date = date;
	}

	private Doc getDoc() {
		return doc;
	}

	private void setDoc(Doc doc) {
		this.doc = doc;
	}

	private String getIntro() {
		return intro;
	}

	private void setIntro(String intro) {
		this.intro = intro;
	}
	
	private int getPermission(){
		return permission;
	}
	
	private void setPermission(int permission){
		this.permission = permission;
	}

}
