package com.devstack.joblisting.repo;

import com.devstack.joblisting.model.Post;
import com.devstack.joblisting.model.User;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);

}
