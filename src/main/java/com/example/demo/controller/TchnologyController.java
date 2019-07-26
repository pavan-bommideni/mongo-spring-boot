package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Technology;
import com.example.demo.model.TechnologyModel;
//import com.example.demo.model.UserModel;
import com.example.demo.service.TechnologyService;

@RestController
public class TchnologyController {
	
	 public TchnologyController() {
		 System.out.println("TchnologyController     ");
	}
	
	@Autowired
	TechnologyService technologyService;
	
	@PostMapping("/technologies")
	public Boolean createUser(@RequestBody TechnologyModel userModel) {
		System.out.println("Tedst     ");
		return technologyService.createUser(userModel);
	}
	
	@GetMapping("/technologies")
	public List<Technology> get() {
		return technologyService.getTechnologies();
	}

}