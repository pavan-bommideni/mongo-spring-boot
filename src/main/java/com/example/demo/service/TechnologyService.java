package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Technology;
import com.example.demo.model.TechnologyModel;
import com.example.demo.repository.TechnologyRepository;


@Service
public class TechnologyService {
	@Autowired
	TechnologyRepository techRepository;
	
	public Boolean createUser(TechnologyModel techModel) {
		Technology tech = new Technology();
		tech.setTechnologyName(techModel.getTechnologyName());
		tech.setSkillset(techModel.getSkillset());
		techRepository.save(tech);
		return true;
}
}
