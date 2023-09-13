package com.workintech.twitter.repository;

import com.workintech.twitter.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findByUserId(Optional<Long> userId);

}
