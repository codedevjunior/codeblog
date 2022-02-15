package com.codeblog.codeblog.repository;

import com.codeblog.codeblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long> {
}
