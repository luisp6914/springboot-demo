package com.luisperez.photoz.clone;

public class Photo {
	//Data fields 
	private String id;
	private String fileName;
	
	
	//Constructor
	public Photo() {
	}
	
	public Photo(String id, String fileName) {
		this.id = id;
		this.fileName = fileName;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	//raw data
	
}
