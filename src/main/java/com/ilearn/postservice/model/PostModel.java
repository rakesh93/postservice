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
    	
    	@Column(name = "title_name")
    	private String titleName;

    	@Column(name = "description")
    	private String description;
    	
    	@Column(name = "post_by_id")
    	private String postById;
    	
    	@Column(name = "post_date", updatable = false)
    	private LocalDateTime createdTime = LocalDateTime.now();

    	public PostModel() {}
    	
		public PostModel(Long id, String titleName, String description, String postById) {
			super();
			this.id = id;
			this.titleName = titleName;
			this.description = description;
			this.postById = postById;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitleName() {
			return titleName;
		}

		public void setTitleName(String titleName) {
			this.titleName = titleName;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPostById() {
			return postById;
		}

		public void setPostById(String postById) {
			this.postById = postById;
		}

		@Override
		public String toString() {
			return "PostModel [id=" + id + ", titleName=" + titleName + ", description=" + description + ", postById="
					+ postById + ", createdTime=" + createdTime + "]";
		}
    
    	
    
}
