package com.mvc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mvc.model.UserRole;

@Repository
public interface UserRoleDAO extends CrudRepository<UserRole, Long> {

}
