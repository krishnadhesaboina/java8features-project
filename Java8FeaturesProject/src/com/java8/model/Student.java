package com.java8.model;

public class Student {

	private int id;
	private String name;
	private int percentage;
	private String stream;
	public Student(int id, String name, int percentage, String stream) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.stream = stream;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + ", stream=" + stream + "]";
	}
}
