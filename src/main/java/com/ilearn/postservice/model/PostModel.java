package com.ilearn.postservice.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

    @Entity
	@Table(name = "postdetails")
	public class PostModel {
    	@Id
    	@GeneratedValue(strategy = GenerationType.IDENTITY)
    	private Long id;
    	
    	@Column(name = "title")
    	private String title;

    	@Column(name = "content")
    	private String content;
    	
    	@Column(name = "user_id")
    	private String userId;
    	
    	@Column(name = "post_date", updatable = false)
    	private LocalDateTime createdTime = LocalDateTime.now();

    	public PostModel() {}
    	
		public PostModel(Long id, String title, String content, String userId) {
			super();
			this.id = id;
			this.title = title;
			this.content = content;
			this.userId = userId;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		@Override
		public String toString() {
			return "PostModel [id=" + id + ", title=" + title + ", content=" + content + ", userId=" + userId
					+ "]";
		}	
    
}
