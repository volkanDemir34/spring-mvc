package com.mvc.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyEntity {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
     
    @Column
    private LocalDate date;
     
    @Column
    private LocalDateTime dateTime;

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Long getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

     
}