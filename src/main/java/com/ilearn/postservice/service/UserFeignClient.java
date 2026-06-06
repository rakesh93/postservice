package com.ilearn.postservice.service;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ilearn.postservice.model.UserModel;

@FeignClient(name = "USERSERVICE")
public interface UserFeignClient {
	
	@GetMapping("/user-service/list/{role}")
	List<UserModel> getUsers(@PathVariable("role") String role);
	
}
