package com.dxc.models;

public class User {
	int id;
	String name;
	String email, job, project, company_name;
	public User() {
		super();
	}
	public User(int id, String name, String email, String job, String project, String company_name) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.job = job;
		this.project = project;
		this.company_name = company_name;
	}
	public User(String name, String email, String job, String project, String company_name) {
		super();
		this.name = name;
		this.email = email;
		this.job = job;
		this.project = project;
		this.company_name = company_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", job=" + job + ", project=" + project
				+ ", company_name=" + company_name + "]";
	}
	
	
	
	

}
