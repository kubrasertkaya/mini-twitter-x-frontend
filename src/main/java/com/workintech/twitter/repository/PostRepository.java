package com.workintech.twitter.repository;

import com.workintech.twitter.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
