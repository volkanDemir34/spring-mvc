package com.mvc.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="post_detail")
public class PostDetail {
	
	@Id
	@GeneratedValue
	private Long id;
	
    @Column(name = "created_by")
	private LocalDate createOn;
	

    @Column(name = "created_by")
    private String createdBy;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="id")
    private Post post;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public LocalDate getCreateOn() {
		return createOn;
	}


	public void setCreateOn(LocalDate createOn) {
		this.createOn = createOn;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public Post getPost() {
		return post;
	}


	public void setPost(Post post) {
		this.post = post;
	}
    
    

	

}
