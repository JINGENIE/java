package com.kbstar.DTO;

public class ItemDTO {
	private int id;
	private String  pwd;
	private String name;
	public ItemDTO() {
	}
	public ItemDTO(int id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ItemDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}

	

}
