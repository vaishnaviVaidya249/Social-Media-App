package com.vaishnavi.models;

public class Post {
	private String content;
	private int timeStamp;
	private String author;
	private int likes;
	private String comment;
	private String location;
	private int shares;
	public Post(String content, int timeStamp, String author, int likes, String comment, String location, int shares) {
		super();
		this.content = content;
		this.timeStamp = timeStamp;
		this.author = author;
		this.likes = likes;
		this.comment = comment;
		this.location = location;
		this.shares = shares;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(int timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	
	

}
