package com.ilearn.postservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ilearn.postservice.model.PostModel;
import com.ilearn.postservice.model.UserModel;
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
    
    //resttemplate call from userservice
    @GetMapping("/user/{userRole}")
    public List<UserModel> getUserDetailsFromUserService(@PathVariable String userRole) {
        return postService.getUserFromUserService(userRole);
    }
    
    //get all list of data
    @GetMapping("/posts")
	public List<PostModel> getUsersByRole() {
	    return postService.getPosts();
	}
    
}
