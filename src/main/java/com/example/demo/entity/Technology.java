package com.example.demo.entity;


import java.util.List;
import org.springframework.data.annotation.Id;


public class Technology {

    @Id
    public String id;

    public String technologyName;
    public List<String> skillset;
    
    public Technology() {}

	public Technology(String id, String technologyName, List<String> skillset) {
		super();
		this.id = id;
		this.technologyName = technologyName;
		this.skillset = skillset;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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