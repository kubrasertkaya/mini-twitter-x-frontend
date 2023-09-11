package com.workintech.twitter.controllers;

import com.workintech.twitter.service.PostService;
import com.workintech.twitter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {
    private PostService postService;
     @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }
}
