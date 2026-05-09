package com.ilearn.postservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ilearn.postservice.model.PostModel;
import com.ilearn.postservice.service.PostService;

@RestController
@RequestMapping("/post-service")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/create")
    public PostModel createPost(@RequestBody PostModel postModel) {
        return postService.createPost(postModel);
    }
	
}
