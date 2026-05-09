package com.ilearn.postservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ilearn.postservice.model.PostModel;
import com.ilearn.postservice.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	public PostModel createPost(PostModel postModel) {
		return postRepository.save(postModel);
	}

}
