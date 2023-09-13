package com.workintech.twitter.controllers;

import com.workintech.twitter.entity.Post;
import com.workintech.twitter.service.PostService;
import com.workintech.twitter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/post")
public class PostController {
    private PostService postService;
     @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts(@RequestParam Optional<Long> userId){
         return postService.getAllPosts(userId);
    }

    @GetMapping("/{postId}")
    public Post getOnePost(@PathVariable long postId){
         return postService.getOnePostById(postId);
    }

    @PostMapping
    public Post createOnePost(@RequestBody Post newPost){
         return postService.createOnePost(newPost);
    }

}
