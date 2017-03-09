package com.hamalaja.blog.om;

/**
 * @author lamhm
 *
 */
public class Article {
	private String id;
	private String title;
	private String updateTime;
	private String content;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getUpdateTime() {
		return updateTime;
	}


	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String toString() {
		return "{id:" + id + ", title:" + title + "}";
	}

}
