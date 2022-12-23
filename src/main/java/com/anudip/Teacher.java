package com.anudip;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Teacher_info")
public class Teacher {
	@Id  //use Id annotation to declare primary key 
	private int T_ID;
	private String Name;
	
	@OneToMany // use OneToMany annotation for Mapping 
	List<Course>course;
	
	public Teacher() // Default Constructor
	{
	}
	
	public Teacher(int t_ID, String name, List<Course> course) // parameterized constructor
	{
		super();
		T_ID = t_ID;
		Name = name;
		this.course = course;
	}
	
	// Using Getter Setter Method
	public int getT_ID() {
		return T_ID;
	}

	public void setT_ID(int t_ID) {
		T_ID = t_ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	
	
	
	
	
	

}
