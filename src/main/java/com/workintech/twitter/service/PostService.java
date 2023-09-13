package com.workintech.twitter.service;

import com.workintech.twitter.entity.Post;
import com.workintech.twitter.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts(Optional<Long> userId) {
        if(userId.isPresent()){
            return postRepository.findByUserId(userId);
        }return postRepository.findAll();
    }

    public Post getOnePostById(long postId) {
        return postRepository.findById(postId).orElse(null);
    }

    public Post createOnePost(Post newPost) {
        return postRepository.save(newPost);
    }
}
