package com.farouk.bengarssallah.tutorial.domain;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Post extends AEntity implements Serializable { 
	
	private String title;
	private String content;
	
	public Post() {}
    
	public Post(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
    

}
