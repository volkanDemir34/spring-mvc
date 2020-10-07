package com.mvc.dao;


import org.springframework.data.repository.CrudRepository;
import com.mvc.model.User;

public interface UsersDAO extends CrudRepository<User, String> {

}
