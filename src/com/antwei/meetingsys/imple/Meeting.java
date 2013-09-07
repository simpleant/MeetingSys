package com.antwei.meetingsys.imple;

public class Meeting {

	private String name;
	private long date;
	private Doc doc;
	private String intro;
	private int permission;
	private String address;

	public Meeting() {

	}

	public Meeting(String name, long date, Doc doc, String intro, String address) {
		super();
		this.name = name;
		this.date = date;
		this.doc = doc;
		this.intro = intro;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
