package com.ziming.myBooks.util;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.ziming.myBooks.pojo.User;

@Component
public interface UserRepository extends MongoRepository<User, Integer>{

}
