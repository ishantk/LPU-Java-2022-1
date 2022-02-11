package com.auribises.model;

public class News{

	String author;
	String newsTitle;
	String newsDescription;
	
	public News() {
		// TODO Auto-generated constructor stub
	}

	public News(String author, String newsTitle, String newsDescription) {
		this.author = author;
		this.newsTitle = newsTitle;
		this.newsDescription = newsDescription;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsDescription() {
		return newsDescription;
	}

	public void setNewsDescription(String newsDescription) {
		this.newsDescription = newsDescription;
	}

	@Override
	public String toString() {
		return "News [author=" + author + ", newsTitle=" + newsTitle + ", newsDescription=" + newsDescription + "]";
	}
	
	
}
