package com.devstack.joblisting.repo;

import com.devstack.joblisting.model.Post;
import com.devstack.joblisting.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository <User,String> {

}
