package com.example.demo.model;

import java.util.List;

public class TechnologyModel {
	
	private int id;
	private String technologyName;
    private List<String> skillset;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTechnologyName() {
		return technologyName;
	}
	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}
	public List<String> getSkillset() {
		return skillset;
	}
	public void setSkillset(List<String> skillset) {
		this.skillset = skillset;
	}
    
    
}
