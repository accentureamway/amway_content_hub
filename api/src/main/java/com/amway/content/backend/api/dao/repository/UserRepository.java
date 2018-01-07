package com.amway.content.backend.api.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.amway.content.backend.api.dao.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
