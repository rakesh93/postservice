package com.ilearn.postservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ilearn.postservice.model.PostModel;
import com.ilearn.postservice.model.UserModel;
import com.ilearn.postservice.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	RestTemplate restTemplate = new RestTemplate();

	public PostModel createPost(PostModel postModel) {
		return postRepository.save(postModel);
	}

	public List<UserModel> getUserFromUserService(String userRole) {
		String url = "http://localhost:5050/user-service/list/" + userRole;
		ResponseEntity<List<UserModel>> response = restTemplate.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<UserModel>>() {
				});

		return response.getBody();
	}

	public List<PostModel> getPosts() {
		return postRepository.findAll();
	}

}
