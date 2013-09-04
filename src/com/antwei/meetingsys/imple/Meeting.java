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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public Doc getDoc() {
		return doc;
	}

	public void setDoc(Doc doc) {
		this.doc = doc;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public int getPermission() {
		return permission;
	}

	public void setPermission(int permission) {
		this.permission = permission;
	}

}
