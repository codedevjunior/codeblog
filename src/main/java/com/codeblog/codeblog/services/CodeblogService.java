package com.codeblog.codeblog.services;

import com.codeblog.codeblog.models.Post;

import java.util.List;

public interface CodeblogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
