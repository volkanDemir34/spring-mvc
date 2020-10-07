package com.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvc.model.MyEntity;

public interface MyEntityDAoO extends JpaRepository<MyEntity, Long> {

}
